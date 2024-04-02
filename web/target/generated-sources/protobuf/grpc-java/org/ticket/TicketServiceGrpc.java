package org.ticket;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.1)",
    comments = "Source: ticket.proto")
public final class TicketServiceGrpc {

  private TicketServiceGrpc() {}

  public static final String SERVICE_NAME = "org.ticket.TicketService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.ticket.TicketOuterClass.Empty,
      org.ticket.TicketOuterClass.TicketList> getGetAllTicketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllTickets",
      requestType = org.ticket.TicketOuterClass.Empty.class,
      responseType = org.ticket.TicketOuterClass.TicketList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.ticket.TicketOuterClass.Empty,
      org.ticket.TicketOuterClass.TicketList> getGetAllTicketsMethod() {
    io.grpc.MethodDescriptor<org.ticket.TicketOuterClass.Empty, org.ticket.TicketOuterClass.TicketList> getGetAllTicketsMethod;
    if ((getGetAllTicketsMethod = TicketServiceGrpc.getGetAllTicketsMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getGetAllTicketsMethod = TicketServiceGrpc.getGetAllTicketsMethod) == null) {
          TicketServiceGrpc.getGetAllTicketsMethod = getGetAllTicketsMethod =
              io.grpc.MethodDescriptor.<org.ticket.TicketOuterClass.Empty, org.ticket.TicketOuterClass.TicketList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllTickets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ticket.TicketOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ticket.TicketOuterClass.TicketList.getDefaultInstance()))
              .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("GetAllTickets"))
              .build();
        }
      }
    }
    return getGetAllTicketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.ticket.TicketOuterClass.TicketRequestId,
      org.ticket.TicketOuterClass.Ticket> getGetTicketByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTicketById",
      requestType = org.ticket.TicketOuterClass.TicketRequestId.class,
      responseType = org.ticket.TicketOuterClass.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.ticket.TicketOuterClass.TicketRequestId,
      org.ticket.TicketOuterClass.Ticket> getGetTicketByIdMethod() {
    io.grpc.MethodDescriptor<org.ticket.TicketOuterClass.TicketRequestId, org.ticket.TicketOuterClass.Ticket> getGetTicketByIdMethod;
    if ((getGetTicketByIdMethod = TicketServiceGrpc.getGetTicketByIdMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getGetTicketByIdMethod = TicketServiceGrpc.getGetTicketByIdMethod) == null) {
          TicketServiceGrpc.getGetTicketByIdMethod = getGetTicketByIdMethod =
              io.grpc.MethodDescriptor.<org.ticket.TicketOuterClass.TicketRequestId, org.ticket.TicketOuterClass.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTicketById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ticket.TicketOuterClass.TicketRequestId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ticket.TicketOuterClass.Ticket.getDefaultInstance()))
              .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("GetTicketById"))
              .build();
        }
      }
    }
    return getGetTicketByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.ticket.TicketOuterClass.Ticket,
      org.ticket.TicketOuterClass.Ticket> getCreateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTicket",
      requestType = org.ticket.TicketOuterClass.Ticket.class,
      responseType = org.ticket.TicketOuterClass.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.ticket.TicketOuterClass.Ticket,
      org.ticket.TicketOuterClass.Ticket> getCreateTicketMethod() {
    io.grpc.MethodDescriptor<org.ticket.TicketOuterClass.Ticket, org.ticket.TicketOuterClass.Ticket> getCreateTicketMethod;
    if ((getCreateTicketMethod = TicketServiceGrpc.getCreateTicketMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getCreateTicketMethod = TicketServiceGrpc.getCreateTicketMethod) == null) {
          TicketServiceGrpc.getCreateTicketMethod = getCreateTicketMethod =
              io.grpc.MethodDescriptor.<org.ticket.TicketOuterClass.Ticket, org.ticket.TicketOuterClass.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ticket.TicketOuterClass.Ticket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ticket.TicketOuterClass.Ticket.getDefaultInstance()))
              .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("CreateTicket"))
              .build();
        }
      }
    }
    return getCreateTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.ticket.TicketOuterClass.Ticket,
      org.ticket.TicketOuterClass.Ticket> getUpdateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTicket",
      requestType = org.ticket.TicketOuterClass.Ticket.class,
      responseType = org.ticket.TicketOuterClass.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.ticket.TicketOuterClass.Ticket,
      org.ticket.TicketOuterClass.Ticket> getUpdateTicketMethod() {
    io.grpc.MethodDescriptor<org.ticket.TicketOuterClass.Ticket, org.ticket.TicketOuterClass.Ticket> getUpdateTicketMethod;
    if ((getUpdateTicketMethod = TicketServiceGrpc.getUpdateTicketMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getUpdateTicketMethod = TicketServiceGrpc.getUpdateTicketMethod) == null) {
          TicketServiceGrpc.getUpdateTicketMethod = getUpdateTicketMethod =
              io.grpc.MethodDescriptor.<org.ticket.TicketOuterClass.Ticket, org.ticket.TicketOuterClass.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ticket.TicketOuterClass.Ticket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ticket.TicketOuterClass.Ticket.getDefaultInstance()))
              .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("UpdateTicket"))
              .build();
        }
      }
    }
    return getUpdateTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.ticket.TicketOuterClass.TicketRequestId,
      org.ticket.TicketOuterClass.Empty> getRemoveTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTicket",
      requestType = org.ticket.TicketOuterClass.TicketRequestId.class,
      responseType = org.ticket.TicketOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.ticket.TicketOuterClass.TicketRequestId,
      org.ticket.TicketOuterClass.Empty> getRemoveTicketMethod() {
    io.grpc.MethodDescriptor<org.ticket.TicketOuterClass.TicketRequestId, org.ticket.TicketOuterClass.Empty> getRemoveTicketMethod;
    if ((getRemoveTicketMethod = TicketServiceGrpc.getRemoveTicketMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getRemoveTicketMethod = TicketServiceGrpc.getRemoveTicketMethod) == null) {
          TicketServiceGrpc.getRemoveTicketMethod = getRemoveTicketMethod =
              io.grpc.MethodDescriptor.<org.ticket.TicketOuterClass.TicketRequestId, org.ticket.TicketOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ticket.TicketOuterClass.TicketRequestId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ticket.TicketOuterClass.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("RemoveTicket"))
              .build();
        }
      }
    }
    return getRemoveTicketMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TicketServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketServiceStub>() {
        @java.lang.Override
        public TicketServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketServiceStub(channel, callOptions);
        }
      };
    return TicketServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TicketServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketServiceBlockingStub>() {
        @java.lang.Override
        public TicketServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketServiceBlockingStub(channel, callOptions);
        }
      };
    return TicketServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TicketServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketServiceFutureStub>() {
        @java.lang.Override
        public TicketServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketServiceFutureStub(channel, callOptions);
        }
      };
    return TicketServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TicketServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllTickets(org.ticket.TicketOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.ticket.TicketOuterClass.TicketList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllTicketsMethod(), responseObserver);
    }

    /**
     */
    public void getTicketById(org.ticket.TicketOuterClass.TicketRequestId request,
        io.grpc.stub.StreamObserver<org.ticket.TicketOuterClass.Ticket> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTicketByIdMethod(), responseObserver);
    }

    /**
     */
    public void createTicket(org.ticket.TicketOuterClass.Ticket request,
        io.grpc.stub.StreamObserver<org.ticket.TicketOuterClass.Ticket> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTicketMethod(), responseObserver);
    }

    /**
     */
    public void updateTicket(org.ticket.TicketOuterClass.Ticket request,
        io.grpc.stub.StreamObserver<org.ticket.TicketOuterClass.Ticket> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTicketMethod(), responseObserver);
    }

    /**
     */
    public void removeTicket(org.ticket.TicketOuterClass.TicketRequestId request,
        io.grpc.stub.StreamObserver<org.ticket.TicketOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveTicketMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllTicketsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.ticket.TicketOuterClass.Empty,
                org.ticket.TicketOuterClass.TicketList>(
                  this, METHODID_GET_ALL_TICKETS)))
          .addMethod(
            getGetTicketByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.ticket.TicketOuterClass.TicketRequestId,
                org.ticket.TicketOuterClass.Ticket>(
                  this, METHODID_GET_TICKET_BY_ID)))
          .addMethod(
            getCreateTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.ticket.TicketOuterClass.Ticket,
                org.ticket.TicketOuterClass.Ticket>(
                  this, METHODID_CREATE_TICKET)))
          .addMethod(
            getUpdateTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.ticket.TicketOuterClass.Ticket,
                org.ticket.TicketOuterClass.Ticket>(
                  this, METHODID_UPDATE_TICKET)))
          .addMethod(
            getRemoveTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.ticket.TicketOuterClass.TicketRequestId,
                org.ticket.TicketOuterClass.Empty>(
                  this, METHODID_REMOVE_TICKET)))
          .build();
    }
  }

  /**
   */
  public static final class TicketServiceStub extends io.grpc.stub.AbstractAsyncStub<TicketServiceStub> {
    private TicketServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllTickets(org.ticket.TicketOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.ticket.TicketOuterClass.TicketList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllTicketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTicketById(org.ticket.TicketOuterClass.TicketRequestId request,
        io.grpc.stub.StreamObserver<org.ticket.TicketOuterClass.Ticket> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTicketByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTicket(org.ticket.TicketOuterClass.Ticket request,
        io.grpc.stub.StreamObserver<org.ticket.TicketOuterClass.Ticket> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTicket(org.ticket.TicketOuterClass.Ticket request,
        io.grpc.stub.StreamObserver<org.ticket.TicketOuterClass.Ticket> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeTicket(org.ticket.TicketOuterClass.TicketRequestId request,
        io.grpc.stub.StreamObserver<org.ticket.TicketOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveTicketMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TicketServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TicketServiceBlockingStub> {
    private TicketServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.ticket.TicketOuterClass.TicketList getAllTickets(org.ticket.TicketOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllTicketsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.ticket.TicketOuterClass.Ticket getTicketById(org.ticket.TicketOuterClass.TicketRequestId request) {
      return blockingUnaryCall(
          getChannel(), getGetTicketByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.ticket.TicketOuterClass.Ticket createTicket(org.ticket.TicketOuterClass.Ticket request) {
      return blockingUnaryCall(
          getChannel(), getCreateTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.ticket.TicketOuterClass.Ticket updateTicket(org.ticket.TicketOuterClass.Ticket request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.ticket.TicketOuterClass.Empty removeTicket(org.ticket.TicketOuterClass.TicketRequestId request) {
      return blockingUnaryCall(
          getChannel(), getRemoveTicketMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TicketServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TicketServiceFutureStub> {
    private TicketServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ticket.TicketOuterClass.TicketList> getAllTickets(
        org.ticket.TicketOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllTicketsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ticket.TicketOuterClass.Ticket> getTicketById(
        org.ticket.TicketOuterClass.TicketRequestId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTicketByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ticket.TicketOuterClass.Ticket> createTicket(
        org.ticket.TicketOuterClass.Ticket request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ticket.TicketOuterClass.Ticket> updateTicket(
        org.ticket.TicketOuterClass.Ticket request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ticket.TicketOuterClass.Empty> removeTicket(
        org.ticket.TicketOuterClass.TicketRequestId request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveTicketMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_TICKETS = 0;
  private static final int METHODID_GET_TICKET_BY_ID = 1;
  private static final int METHODID_CREATE_TICKET = 2;
  private static final int METHODID_UPDATE_TICKET = 3;
  private static final int METHODID_REMOVE_TICKET = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TicketServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TicketServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_TICKETS:
          serviceImpl.getAllTickets((org.ticket.TicketOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<org.ticket.TicketOuterClass.TicketList>) responseObserver);
          break;
        case METHODID_GET_TICKET_BY_ID:
          serviceImpl.getTicketById((org.ticket.TicketOuterClass.TicketRequestId) request,
              (io.grpc.stub.StreamObserver<org.ticket.TicketOuterClass.Ticket>) responseObserver);
          break;
        case METHODID_CREATE_TICKET:
          serviceImpl.createTicket((org.ticket.TicketOuterClass.Ticket) request,
              (io.grpc.stub.StreamObserver<org.ticket.TicketOuterClass.Ticket>) responseObserver);
          break;
        case METHODID_UPDATE_TICKET:
          serviceImpl.updateTicket((org.ticket.TicketOuterClass.Ticket) request,
              (io.grpc.stub.StreamObserver<org.ticket.TicketOuterClass.Ticket>) responseObserver);
          break;
        case METHODID_REMOVE_TICKET:
          serviceImpl.removeTicket((org.ticket.TicketOuterClass.TicketRequestId) request,
              (io.grpc.stub.StreamObserver<org.ticket.TicketOuterClass.Empty>) responseObserver);
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

  private static abstract class TicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TicketServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.ticket.TicketOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TicketService");
    }
  }

  private static final class TicketServiceFileDescriptorSupplier
      extends TicketServiceBaseDescriptorSupplier {
    TicketServiceFileDescriptorSupplier() {}
  }

  private static final class TicketServiceMethodDescriptorSupplier
      extends TicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TicketServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TicketServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TicketServiceFileDescriptorSupplier())
              .addMethod(getGetAllTicketsMethod())
              .addMethod(getGetTicketByIdMethod())
              .addMethod(getCreateTicketMethod())
              .addMethod(getUpdateTicketMethod())
              .addMethod(getRemoveTicketMethod())
              .build();
        }
      }
    }
    return result;
  }
}
