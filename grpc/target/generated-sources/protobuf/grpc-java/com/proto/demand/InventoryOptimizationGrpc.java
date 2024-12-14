package com.proto.demand;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.0)",
    comments = "Source: inventory.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InventoryOptimizationGrpc {

  private InventoryOptimizationGrpc() {}

  public static final String SERVICE_NAME = "inventory.InventoryOptimization";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.demand.OptimizeRequest,
      com.proto.demand.OptimizeResponse> getOptimizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Optimize",
      requestType = com.proto.demand.OptimizeRequest.class,
      responseType = com.proto.demand.OptimizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.demand.OptimizeRequest,
      com.proto.demand.OptimizeResponse> getOptimizeMethod() {
    io.grpc.MethodDescriptor<com.proto.demand.OptimizeRequest, com.proto.demand.OptimizeResponse> getOptimizeMethod;
    if ((getOptimizeMethod = InventoryOptimizationGrpc.getOptimizeMethod) == null) {
      synchronized (InventoryOptimizationGrpc.class) {
        if ((getOptimizeMethod = InventoryOptimizationGrpc.getOptimizeMethod) == null) {
          InventoryOptimizationGrpc.getOptimizeMethod = getOptimizeMethod =
              io.grpc.MethodDescriptor.<com.proto.demand.OptimizeRequest, com.proto.demand.OptimizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Optimize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.demand.OptimizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.demand.OptimizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryOptimizationMethodDescriptorSupplier("Optimize"))
              .build();
        }
      }
    }
    return getOptimizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.demand.DemandRequest,
      com.proto.demand.DemandResponse> getDemandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Demand",
      requestType = com.proto.demand.DemandRequest.class,
      responseType = com.proto.demand.DemandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.demand.DemandRequest,
      com.proto.demand.DemandResponse> getDemandMethod() {
    io.grpc.MethodDescriptor<com.proto.demand.DemandRequest, com.proto.demand.DemandResponse> getDemandMethod;
    if ((getDemandMethod = InventoryOptimizationGrpc.getDemandMethod) == null) {
      synchronized (InventoryOptimizationGrpc.class) {
        if ((getDemandMethod = InventoryOptimizationGrpc.getDemandMethod) == null) {
          InventoryOptimizationGrpc.getDemandMethod = getDemandMethod =
              io.grpc.MethodDescriptor.<com.proto.demand.DemandRequest, com.proto.demand.DemandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Demand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.demand.DemandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.demand.DemandResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryOptimizationMethodDescriptorSupplier("Demand"))
              .build();
        }
      }
    }
    return getDemandMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryOptimizationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryOptimizationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryOptimizationStub>() {
        @java.lang.Override
        public InventoryOptimizationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryOptimizationStub(channel, callOptions);
        }
      };
    return InventoryOptimizationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryOptimizationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryOptimizationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryOptimizationBlockingStub>() {
        @java.lang.Override
        public InventoryOptimizationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryOptimizationBlockingStub(channel, callOptions);
        }
      };
    return InventoryOptimizationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryOptimizationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryOptimizationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryOptimizationFutureStub>() {
        @java.lang.Override
        public InventoryOptimizationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryOptimizationFutureStub(channel, callOptions);
        }
      };
    return InventoryOptimizationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class InventoryOptimizationImplBase implements io.grpc.BindableService {

    /**
     */
    public void optimize(com.proto.demand.OptimizeRequest request,
        io.grpc.stub.StreamObserver<com.proto.demand.OptimizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOptimizeMethod(), responseObserver);
    }

    /**
     */
    public void demand(com.proto.demand.DemandRequest request,
        io.grpc.stub.StreamObserver<com.proto.demand.DemandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDemandMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOptimizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.demand.OptimizeRequest,
                com.proto.demand.OptimizeResponse>(
                  this, METHODID_OPTIMIZE)))
          .addMethod(
            getDemandMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.demand.DemandRequest,
                com.proto.demand.DemandResponse>(
                  this, METHODID_DEMAND)))
          .build();
    }
  }

  /**
   */
  public static final class InventoryOptimizationStub extends io.grpc.stub.AbstractAsyncStub<InventoryOptimizationStub> {
    private InventoryOptimizationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryOptimizationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryOptimizationStub(channel, callOptions);
    }

    /**
     */
    public void optimize(com.proto.demand.OptimizeRequest request,
        io.grpc.stub.StreamObserver<com.proto.demand.OptimizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOptimizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void demand(com.proto.demand.DemandRequest request,
        io.grpc.stub.StreamObserver<com.proto.demand.DemandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDemandMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InventoryOptimizationBlockingStub extends io.grpc.stub.AbstractBlockingStub<InventoryOptimizationBlockingStub> {
    private InventoryOptimizationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryOptimizationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryOptimizationBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.demand.OptimizeResponse optimize(com.proto.demand.OptimizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOptimizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.demand.DemandResponse demand(com.proto.demand.DemandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDemandMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InventoryOptimizationFutureStub extends io.grpc.stub.AbstractFutureStub<InventoryOptimizationFutureStub> {
    private InventoryOptimizationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryOptimizationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryOptimizationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.demand.OptimizeResponse> optimize(
        com.proto.demand.OptimizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOptimizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.demand.DemandResponse> demand(
        com.proto.demand.DemandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDemandMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPTIMIZE = 0;
  private static final int METHODID_DEMAND = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InventoryOptimizationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InventoryOptimizationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPTIMIZE:
          serviceImpl.optimize((com.proto.demand.OptimizeRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.demand.OptimizeResponse>) responseObserver);
          break;
        case METHODID_DEMAND:
          serviceImpl.demand((com.proto.demand.DemandRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.demand.DemandResponse>) responseObserver);
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

  private static abstract class InventoryOptimizationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryOptimizationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.demand.Inventory.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryOptimization");
    }
  }

  private static final class InventoryOptimizationFileDescriptorSupplier
      extends InventoryOptimizationBaseDescriptorSupplier {
    InventoryOptimizationFileDescriptorSupplier() {}
  }

  private static final class InventoryOptimizationMethodDescriptorSupplier
      extends InventoryOptimizationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InventoryOptimizationMethodDescriptorSupplier(String methodName) {
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
      synchronized (InventoryOptimizationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryOptimizationFileDescriptorSupplier())
              .addMethod(getOptimizeMethod())
              .addMethod(getDemandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
