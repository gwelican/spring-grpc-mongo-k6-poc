package io.grpc.teams;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.1)",
    comments = "Source: Teams.proto")
public final class TeamsGrpc {

  private TeamsGrpc() {}

  public static final String SERVICE_NAME = "Teams";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.teams.TeamsOuterClass.CreateTeamRequest,
      io.grpc.teams.TeamsOuterClass.CreateTeamResponse> getCreateTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTeam",
      requestType = io.grpc.teams.TeamsOuterClass.CreateTeamRequest.class,
      responseType = io.grpc.teams.TeamsOuterClass.CreateTeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.teams.TeamsOuterClass.CreateTeamRequest,
      io.grpc.teams.TeamsOuterClass.CreateTeamResponse> getCreateTeamMethod() {
    io.grpc.MethodDescriptor<io.grpc.teams.TeamsOuterClass.CreateTeamRequest, io.grpc.teams.TeamsOuterClass.CreateTeamResponse> getCreateTeamMethod;
    if ((getCreateTeamMethod = TeamsGrpc.getCreateTeamMethod) == null) {
      synchronized (TeamsGrpc.class) {
        if ((getCreateTeamMethod = TeamsGrpc.getCreateTeamMethod) == null) {
          TeamsGrpc.getCreateTeamMethod = getCreateTeamMethod =
              io.grpc.MethodDescriptor.<io.grpc.teams.TeamsOuterClass.CreateTeamRequest, io.grpc.teams.TeamsOuterClass.CreateTeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.TeamsOuterClass.CreateTeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.TeamsOuterClass.CreateTeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamsMethodDescriptorSupplier("CreateTeam"))
              .build();
        }
      }
    }
    return getCreateTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.teams.TeamsOuterClass.GetTeamRequest,
      io.grpc.teams.TeamsOuterClass.GetTeamResponse> getGetTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTeam",
      requestType = io.grpc.teams.TeamsOuterClass.GetTeamRequest.class,
      responseType = io.grpc.teams.TeamsOuterClass.GetTeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.teams.TeamsOuterClass.GetTeamRequest,
      io.grpc.teams.TeamsOuterClass.GetTeamResponse> getGetTeamMethod() {
    io.grpc.MethodDescriptor<io.grpc.teams.TeamsOuterClass.GetTeamRequest, io.grpc.teams.TeamsOuterClass.GetTeamResponse> getGetTeamMethod;
    if ((getGetTeamMethod = TeamsGrpc.getGetTeamMethod) == null) {
      synchronized (TeamsGrpc.class) {
        if ((getGetTeamMethod = TeamsGrpc.getGetTeamMethod) == null) {
          TeamsGrpc.getGetTeamMethod = getGetTeamMethod =
              io.grpc.MethodDescriptor.<io.grpc.teams.TeamsOuterClass.GetTeamRequest, io.grpc.teams.TeamsOuterClass.GetTeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.TeamsOuterClass.GetTeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.TeamsOuterClass.GetTeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamsMethodDescriptorSupplier("GetTeam"))
              .build();
        }
      }
    }
    return getGetTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.teams.TeamsOuterClass.UpdateTeamRequest,
      io.grpc.teams.TeamsOuterClass.UpdateTeamResponse> getUpdateTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTeam",
      requestType = io.grpc.teams.TeamsOuterClass.UpdateTeamRequest.class,
      responseType = io.grpc.teams.TeamsOuterClass.UpdateTeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.teams.TeamsOuterClass.UpdateTeamRequest,
      io.grpc.teams.TeamsOuterClass.UpdateTeamResponse> getUpdateTeamMethod() {
    io.grpc.MethodDescriptor<io.grpc.teams.TeamsOuterClass.UpdateTeamRequest, io.grpc.teams.TeamsOuterClass.UpdateTeamResponse> getUpdateTeamMethod;
    if ((getUpdateTeamMethod = TeamsGrpc.getUpdateTeamMethod) == null) {
      synchronized (TeamsGrpc.class) {
        if ((getUpdateTeamMethod = TeamsGrpc.getUpdateTeamMethod) == null) {
          TeamsGrpc.getUpdateTeamMethod = getUpdateTeamMethod =
              io.grpc.MethodDescriptor.<io.grpc.teams.TeamsOuterClass.UpdateTeamRequest, io.grpc.teams.TeamsOuterClass.UpdateTeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.TeamsOuterClass.UpdateTeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.TeamsOuterClass.UpdateTeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamsMethodDescriptorSupplier("UpdateTeam"))
              .build();
        }
      }
    }
    return getUpdateTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.teams.TeamsOuterClass.DeleteTeamRequest,
      io.grpc.teams.TeamsOuterClass.DeleteTeamResponse> getDeleteTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTeam",
      requestType = io.grpc.teams.TeamsOuterClass.DeleteTeamRequest.class,
      responseType = io.grpc.teams.TeamsOuterClass.DeleteTeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.teams.TeamsOuterClass.DeleteTeamRequest,
      io.grpc.teams.TeamsOuterClass.DeleteTeamResponse> getDeleteTeamMethod() {
    io.grpc.MethodDescriptor<io.grpc.teams.TeamsOuterClass.DeleteTeamRequest, io.grpc.teams.TeamsOuterClass.DeleteTeamResponse> getDeleteTeamMethod;
    if ((getDeleteTeamMethod = TeamsGrpc.getDeleteTeamMethod) == null) {
      synchronized (TeamsGrpc.class) {
        if ((getDeleteTeamMethod = TeamsGrpc.getDeleteTeamMethod) == null) {
          TeamsGrpc.getDeleteTeamMethod = getDeleteTeamMethod =
              io.grpc.MethodDescriptor.<io.grpc.teams.TeamsOuterClass.DeleteTeamRequest, io.grpc.teams.TeamsOuterClass.DeleteTeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.TeamsOuterClass.DeleteTeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.teams.TeamsOuterClass.DeleteTeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamsMethodDescriptorSupplier("DeleteTeam"))
              .build();
        }
      }
    }
    return getDeleteTeamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TeamsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeamsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeamsStub>() {
        @java.lang.Override
        public TeamsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeamsStub(channel, callOptions);
        }
      };
    return TeamsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TeamsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeamsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeamsBlockingStub>() {
        @java.lang.Override
        public TeamsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeamsBlockingStub(channel, callOptions);
        }
      };
    return TeamsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TeamsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeamsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeamsFutureStub>() {
        @java.lang.Override
        public TeamsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeamsFutureStub(channel, callOptions);
        }
      };
    return TeamsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TeamsImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTeam(io.grpc.teams.TeamsOuterClass.CreateTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.TeamsOuterClass.CreateTeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTeamMethod(), responseObserver);
    }

    /**
     */
    public void getTeam(io.grpc.teams.TeamsOuterClass.GetTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.TeamsOuterClass.GetTeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTeamMethod(), responseObserver);
    }

    /**
     */
    public void updateTeam(io.grpc.teams.TeamsOuterClass.UpdateTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.TeamsOuterClass.UpdateTeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTeamMethod(), responseObserver);
    }

    /**
     */
    public void deleteTeam(io.grpc.teams.TeamsOuterClass.DeleteTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.TeamsOuterClass.DeleteTeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTeamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTeamMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.teams.TeamsOuterClass.CreateTeamRequest,
                io.grpc.teams.TeamsOuterClass.CreateTeamResponse>(
                  this, METHODID_CREATE_TEAM)))
          .addMethod(
            getGetTeamMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.teams.TeamsOuterClass.GetTeamRequest,
                io.grpc.teams.TeamsOuterClass.GetTeamResponse>(
                  this, METHODID_GET_TEAM)))
          .addMethod(
            getUpdateTeamMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.teams.TeamsOuterClass.UpdateTeamRequest,
                io.grpc.teams.TeamsOuterClass.UpdateTeamResponse>(
                  this, METHODID_UPDATE_TEAM)))
          .addMethod(
            getDeleteTeamMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.teams.TeamsOuterClass.DeleteTeamRequest,
                io.grpc.teams.TeamsOuterClass.DeleteTeamResponse>(
                  this, METHODID_DELETE_TEAM)))
          .build();
    }
  }

  /**
   */
  public static final class TeamsStub extends io.grpc.stub.AbstractAsyncStub<TeamsStub> {
    private TeamsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeamsStub(channel, callOptions);
    }

    /**
     */
    public void createTeam(io.grpc.teams.TeamsOuterClass.CreateTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.TeamsOuterClass.CreateTeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeam(io.grpc.teams.TeamsOuterClass.GetTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.TeamsOuterClass.GetTeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTeam(io.grpc.teams.TeamsOuterClass.UpdateTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.TeamsOuterClass.UpdateTeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTeam(io.grpc.teams.TeamsOuterClass.DeleteTeamRequest request,
        io.grpc.stub.StreamObserver<io.grpc.teams.TeamsOuterClass.DeleteTeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTeamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TeamsBlockingStub extends io.grpc.stub.AbstractBlockingStub<TeamsBlockingStub> {
    private TeamsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeamsBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.teams.TeamsOuterClass.CreateTeamResponse createTeam(io.grpc.teams.TeamsOuterClass.CreateTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.teams.TeamsOuterClass.GetTeamResponse getTeam(io.grpc.teams.TeamsOuterClass.GetTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.teams.TeamsOuterClass.UpdateTeamResponse updateTeam(io.grpc.teams.TeamsOuterClass.UpdateTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.teams.TeamsOuterClass.DeleteTeamResponse deleteTeam(io.grpc.teams.TeamsOuterClass.DeleteTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTeamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TeamsFutureStub extends io.grpc.stub.AbstractFutureStub<TeamsFutureStub> {
    private TeamsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeamsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.teams.TeamsOuterClass.CreateTeamResponse> createTeam(
        io.grpc.teams.TeamsOuterClass.CreateTeamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.teams.TeamsOuterClass.GetTeamResponse> getTeam(
        io.grpc.teams.TeamsOuterClass.GetTeamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.teams.TeamsOuterClass.UpdateTeamResponse> updateTeam(
        io.grpc.teams.TeamsOuterClass.UpdateTeamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.teams.TeamsOuterClass.DeleteTeamResponse> deleteTeam(
        io.grpc.teams.TeamsOuterClass.DeleteTeamRequest request) {
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
    private final TeamsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TeamsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TEAM:
          serviceImpl.createTeam((io.grpc.teams.TeamsOuterClass.CreateTeamRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.teams.TeamsOuterClass.CreateTeamResponse>) responseObserver);
          break;
        case METHODID_GET_TEAM:
          serviceImpl.getTeam((io.grpc.teams.TeamsOuterClass.GetTeamRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.teams.TeamsOuterClass.GetTeamResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TEAM:
          serviceImpl.updateTeam((io.grpc.teams.TeamsOuterClass.UpdateTeamRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.teams.TeamsOuterClass.UpdateTeamResponse>) responseObserver);
          break;
        case METHODID_DELETE_TEAM:
          serviceImpl.deleteTeam((io.grpc.teams.TeamsOuterClass.DeleteTeamRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.teams.TeamsOuterClass.DeleteTeamResponse>) responseObserver);
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

  private static abstract class TeamsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TeamsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.teams.TeamsOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Teams");
    }
  }

  private static final class TeamsFileDescriptorSupplier
      extends TeamsBaseDescriptorSupplier {
    TeamsFileDescriptorSupplier() {}
  }

  private static final class TeamsMethodDescriptorSupplier
      extends TeamsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TeamsMethodDescriptorSupplier(String methodName) {
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
      synchronized (TeamsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TeamsFileDescriptorSupplier())
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
