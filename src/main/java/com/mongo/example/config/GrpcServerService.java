package com.mongo.example.config;

import brave.Span;
import brave.Tracer;
import io.grpc.stub.StreamObserver;
import io.grpc.teams.TeamServiceGrpc;
import io.grpc.teams.Teams;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import reactor.core.publisher.Mono;

import java.util.UUID;

@GrpcService
@RequiredArgsConstructor
public class GrpcServerService extends TeamServiceGrpc.TeamServiceImplBase {

    private final TeamRepository teamRepository;
    private final Tracer tracer;

    @NewSpan
    @Override
    public void createTeam(Teams.CreateTeamRequest request, StreamObserver<Teams.CreateTeamResponse> responseObserver) {
        String teamId = UUID.randomUUID().toString();
        Span newSpan = tracer.nextSpan().name("Mongodb").start();
        try (Tracer.SpanInScope ws = tracer.withSpanInScope(newSpan.start())) {
            teamRepository.save(new Team(teamId, request.getName())).block();
        } finally {
            newSpan.finish();
        }

        var reply = Teams.CreateTeamResponse.newBuilder().setId(teamId).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();

    }

    @Override
    public void getTeam(Teams.GetTeamRequest request, StreamObserver<Teams.GetTeamResponse> responseObserver) {
        Mono<Team> teamDao = teamRepository.findById(request.getId());
        Mono<Teams.team> team = teamDao.map(t -> Teams.team.newBuilder()
                .setId(t.getId())
                .setName(t.getName())
                .build());
        var reply = Teams.GetTeamResponse.newBuilder().setTeam(team.block()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void updateTeam(Teams.UpdateTeamRequest request, StreamObserver<Teams.UpdateTeamResponse> responseObserver) {

        var team = teamRepository.findById(UUID.randomUUID().toString()).block();
        team.setName(request.getName());
        teamRepository.save(team);
        var reply = Teams.UpdateTeamResponse.newBuilder().setStatus(200).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteTeam(Teams.DeleteTeamRequest request, StreamObserver<Teams.DeleteTeamResponse> responseObserver) {
        teamRepository.deleteById(request.getId());
        var reply = Teams.DeleteTeamResponse.newBuilder().setStatus(200).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
