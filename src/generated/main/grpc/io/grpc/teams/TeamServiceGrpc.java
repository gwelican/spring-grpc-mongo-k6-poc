package io.grpc.teams;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.1)",
    comments = "Source: Teams.proto")
public final class TeamServiceGrpc {

  private TeamServiceGrpc() {}

  public static final String SERVICE_NAME = "TeamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.teams.Teams.CreateTeamRequest,
      io.grpc.teams.Teams.CreateTeamResponse> getCreateTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTeam",
      requestType = io.grpc.teams.Teams.CreateTeamRequest.class,
      responseType = io.grpc.teams.Teams.CreateTeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.teams.Teams.CreateTeamRequest,
      io.grpc.teams.Teams.CreateTeamResponse> getCreateTeamMethod() {
    io.grpc.MethodDescriptor<io.grpc.teams.Teams.CreateTeamRequest, io.grpc.teams.Teams.CreateTeamResponse> getCreateTeamMethod;
    if ((getCreateTeamMethod = TeamServiceGrpc.getCreateTeamMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getCreateTeamMethod = TeamServiceGrpc.getCreateTeamMethod) == null) {
          TeamServiceGrpc.getCreateTeamMethod = getCreateTeamMethod =
              io.grpc.MethodDescriptor.<io.grpc.teams.Teams.CreateTeamRequest, io.grpc.teams.Teams.CreateTeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.Teams.CreateTeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.Teams.CreateTeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("CreateTeam"))
              .build();
        }
      }
    }
    return getCreateTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.teams.Teams.GetTeamRequest,
      io.grpc.teams.Teams.GetTeamResponse> getGetTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTeam",
      requestType = io.grpc.teams.Teams.GetTeamRequest.class,
      responseType = io.grpc.teams.Teams.GetTeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.teams.Teams.GetTeamRequest,
      io.grpc.teams.Teams.GetTeamResponse> getGetTeamMethod() {
    io.grpc.MethodDescriptor<io.grpc.teams.Teams.GetTeamRequest, io.grpc.teams.Teams.GetTeamResponse> getGetTeamMethod;
    if ((getGetTeamMethod = TeamServiceGrpc.getGetTeamMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getGetTeamMethod = TeamServiceGrpc.getGetTeamMethod) == null) {
          TeamServiceGrpc.getGetTeamMethod = getGetTeamMethod =
              io.grpc.MethodDescriptor.<io.grpc.teams.Teams.GetTeamRequest, io.grpc.teams.Teams.GetTeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.Teams.GetTeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.Teams.GetTeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("GetTeam"))
              .build();
        }
      }
    }
    return getGetTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.teams.Teams.UpdateTeamRequest,
      io.grpc.teams.Teams.UpdateTeamResponse> getUpdateTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTeam",
      requestType = io.grpc.teams.Teams.UpdateTeamRequest.class,
      responseType = io.grpc.teams.Teams.UpdateTeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.teams.Teams.UpdateTeamRequest,
      io.grpc.teams.Teams.UpdateTeamResponse> getUpdateTeamMethod() {
    io.grpc.MethodDescriptor<io.grpc.teams.Teams.UpdateTeamRequest, io.grpc.teams.Teams.UpdateTeamResponse> getUpdateTeamMethod;
    if ((getUpdateTeamMethod = TeamServiceGrpc.getUpdateTeamMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getUpdateTeamMethod = TeamServiceGrpc.getUpdateTeamMethod) == null) {
          TeamServiceGrpc.getUpdateTeamMethod = getUpdateTeamMethod =
              io.grpc.MethodDescriptor.<io.grpc.teams.Teams.UpdateTeamRequest, io.grpc.teams.Teams.UpdateTeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.Teams.UpdateTeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.Teams.UpdateTeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("UpdateTeam"))
              .build();
        }
      }
    }
    return getUpdateTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.teams.Teams.DeleteTeamRequest,
      io.grpc.teams.Teams.DeleteTeamResponse> getDeleteTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTeam",
      requestType = io.grpc.teams.Teams.DeleteTeamRequest.class,
      responseType = io.grpc.teams.Teams.DeleteTeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.teams.Teams.DeleteTeamRequest,
      io.grpc.teams.Teams.DeleteTeamResponse> getDeleteTeamMethod() {
    io.grpc.MethodDescriptor<io.grpc.teams.Teams.DeleteTeamRequest, io.grpc.teams.Teams.DeleteTeamResponse> getDeleteTeamMethod;
    if ((getDeleteTeamMethod = TeamServiceGrpc.getDeleteTeamMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getDeleteTeamMethod = TeamServiceGrpc.getDeleteTeamMethod) == null) {
          TeamServiceGrpc.getDeleteTeamMethod = getDeleteTeamMethod =
              io.grpc.MethodDescriptor.<io.grpc.teams.Teams.DeleteTeamRequest, io.grpc.teams.Teams.DeleteTeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.Teams.DeleteTeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.Teams.DeleteTeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("DeleteTeam"))
              .build();
        }
      }
    }
    return getDeleteTeamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TeamServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeamServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeamServiceStub>() {
        @java.lang.Override
        public TeamServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeamServiceStub(channel, callOptions);
        }
      };
    return TeamServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TeamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeamServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeamServiceBlockingStub>() {
        @java.lang.Override
        public TeamServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeamServiceBlockingStub(channel, callOptions);
        }
      };
    return TeamServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TeamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeamServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeamServiceFutureStub>() {
        @java.lang.Override
        public TeamServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeamServiceFutureStub(channel, callOptions);
        }
      };
    return TeamServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TeamServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTeam(io.grpc.teams.Teams.CreateTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.Teams.CreateTeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTeamMethod(), responseObserver);
    }

    /**
     */
    public void getTeam(io.grpc.teams.Teams.GetTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.Teams.GetTeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTeamMethod(), responseObserver);
    }

    /**
     */
    public void updateTeam(io.grpc.teams.Teams.UpdateTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.Teams.UpdateTeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTeamMethod(), responseObserver);
    }

    /**
     */
    public void deleteTeam(io.grpc.teams.Teams.DeleteTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.Teams.DeleteTeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTeamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTeamMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.teams.Teams.CreateTeamRequest,
                io.grpc.teams.Teams.CreateTeamResponse>(
                  this, METHODID_CREATE_TEAM)))
          .addMethod(
            getGetTeamMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.teams.Teams.GetTeamRequest,
                io.grpc.teams.Teams.GetTeamResponse>(
                  this, METHODID_GET_TEAM)))
          .addMethod(
            getUpdateTeamMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.teams.Teams.UpdateTeamRequest,
                io.grpc.teams.Teams.UpdateTeamResponse>(
                  this, METHODID_UPDATE_TEAM)))
          .addMethod(
            getDeleteTeamMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.teams.Teams.DeleteTeamRequest,
                io.grpc.teams.Teams.DeleteTeamResponse>(
                  this, METHODID_DELETE_TEAM)))
          .build();
    }
  }

  /**
   */
  public static final class TeamServiceStub extends io.grpc.stub.AbstractAsyncStub<TeamServiceStub> {
    private TeamServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeamServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTeam(io.grpc.teams.Teams.CreateTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.Teams.CreateTeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeam(io.grpc.teams.Teams.GetTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.Teams.GetTeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTeam(io.grpc.teams.Teams.UpdateTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.Teams.UpdateTeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTeam(io.grpc.teams.Teams.DeleteTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.Teams.DeleteTeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTeamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TeamServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TeamServiceBlockingStub> {
    private TeamServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeamServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.teams.Teams.CreateTeamResponse createTeam(io.grpc.teams.Teams.CreateTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.teams.Teams.GetTeamResponse getTeam(io.grpc.teams.Teams.GetTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.teams.Teams.UpdateTeamResponse updateTeam(io.grpc.teams.Teams.UpdateTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.teams.Teams.DeleteTeamResponse deleteTeam(io.grpc.teams.Teams.DeleteTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTeamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TeamServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TeamServiceFutureStub> {
    private TeamServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeamServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.teams.Teams.CreateTeamResponse> createTeam(
        io.grpc.teams.Teams.CreateTeamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.teams.Teams.GetTeamResponse> getTeam(
        io.grpc.teams.Teams.GetTeamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.teams.Teams.UpdateTeamResponse> updateTeam(
        io.grpc.teams.Teams.UpdateTeamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.teams.Teams.DeleteTeamResponse> deleteTeam(
        io.grpc.teams.Teams.DeleteTeamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTeamMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TEAM = 0;
  private static final int METHODID_GET_TEAM = 1;
  private static final int METHODID_UPDATE_TEAM = 2;
  private static final int METHODID_DELETE_TEAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TeamServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TeamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TEAM:
          serviceImpl.createTeam((io.grpc.teams.Teams.CreateTeamRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.teams.Teams.CreateTeamResponse>) responseObserver);
          break;
        case METHODID_GET_TEAM:
          serviceImpl.getTeam((io.grpc.teams.Teams.GetTeamRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.teams.Teams.GetTeamResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TEAM:
          serviceImpl.updateTeam((io.grpc.teams.Teams.UpdateTeamRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.teams.Teams.UpdateTeamResponse>) responseObserver);
          break;
        case METHODID_DELETE_TEAM:
          serviceImpl.deleteTeam((io.grpc.teams.Teams.DeleteTeamRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.teams.Teams.DeleteTeamResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TeamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TeamServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.teams.Teams.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TeamService");
    }
  }

  private static final class TeamServiceFileDescriptorSupplier
      extends TeamServiceBaseDescriptorSupplier {
    TeamServiceFileDescriptorSupplier() {}
  }

  private static final class TeamServiceMethodDescriptorSupplier
      extends TeamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TeamServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TeamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TeamServiceFileDescriptorSupplier())
              .addMethod(getCreateTeamMethod())
              .addMethod(getGetTeamMethod())
              .addMethod(getUpdateTeamMethod())
              .addMethod(getDeleteTeamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
