package com.example.grpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: library.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LibraryServiceGrpc {

  private LibraryServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.service.LibraryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.service.BookRequest,
      com.example.grpc.service.BookResponse> getGetBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBook",
      requestType = com.example.grpc.service.BookRequest.class,
      responseType = com.example.grpc.service.BookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.service.BookRequest,
      com.example.grpc.service.BookResponse> getGetBookMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.service.BookRequest, com.example.grpc.service.BookResponse> getGetBookMethod;
    if ((getGetBookMethod = LibraryServiceGrpc.getGetBookMethod) == null) {
      synchronized (LibraryServiceGrpc.class) {
        if ((getGetBookMethod = LibraryServiceGrpc.getGetBookMethod) == null) {
          LibraryServiceGrpc.getGetBookMethod = getGetBookMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.service.BookRequest, com.example.grpc.service.BookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.service.BookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.service.BookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LibraryServiceMethodDescriptorSupplier("getBook"))
              .build();
        }
      }
    }
    return getGetBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.service.Book,
      com.example.grpc.service.BookResponse> getAddBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addBook",
      requestType = com.example.grpc.service.Book.class,
      responseType = com.example.grpc.service.BookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.service.Book,
      com.example.grpc.service.BookResponse> getAddBookMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.service.Book, com.example.grpc.service.BookResponse> getAddBookMethod;
    if ((getAddBookMethod = LibraryServiceGrpc.getAddBookMethod) == null) {
      synchronized (LibraryServiceGrpc.class) {
        if ((getAddBookMethod = LibraryServiceGrpc.getAddBookMethod) == null) {
          LibraryServiceGrpc.getAddBookMethod = getAddBookMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.service.Book, com.example.grpc.service.BookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.service.Book.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.service.BookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LibraryServiceMethodDescriptorSupplier("addBook"))
              .build();
        }
      }
    }
    return getAddBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.example.grpc.service.BookListResponse> getListBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listBook",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.example.grpc.service.BookListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.example.grpc.service.BookListResponse> getListBookMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.example.grpc.service.BookListResponse> getListBookMethod;
    if ((getListBookMethod = LibraryServiceGrpc.getListBookMethod) == null) {
      synchronized (LibraryServiceGrpc.class) {
        if ((getListBookMethod = LibraryServiceGrpc.getListBookMethod) == null) {
          LibraryServiceGrpc.getListBookMethod = getListBookMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.example.grpc.service.BookListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.service.BookListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LibraryServiceMethodDescriptorSupplier("listBook"))
              .build();
        }
      }
    }
    return getListBookMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LibraryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LibraryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LibraryServiceStub>() {
        @java.lang.Override
        public LibraryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LibraryServiceStub(channel, callOptions);
        }
      };
    return LibraryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LibraryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LibraryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LibraryServiceBlockingStub>() {
        @java.lang.Override
        public LibraryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LibraryServiceBlockingStub(channel, callOptions);
        }
      };
    return LibraryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LibraryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LibraryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LibraryServiceFutureStub>() {
        @java.lang.Override
        public LibraryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LibraryServiceFutureStub(channel, callOptions);
        }
      };
    return LibraryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LibraryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBook(com.example.grpc.service.BookRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.service.BookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBookMethod(), responseObserver);
    }

    /**
     */
    public void addBook(com.example.grpc.service.Book request,
        io.grpc.stub.StreamObserver<com.example.grpc.service.BookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddBookMethod(), responseObserver);
    }

    /**
     */
    public void listBook(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.service.BookListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBookMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBookMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.service.BookRequest,
                com.example.grpc.service.BookResponse>(
                  this, METHODID_GET_BOOK)))
          .addMethod(
            getAddBookMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.service.Book,
                com.example.grpc.service.BookResponse>(
                  this, METHODID_ADD_BOOK)))
          .addMethod(
            getListBookMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.example.grpc.service.BookListResponse>(
                  this, METHODID_LIST_BOOK)))
          .build();
    }
  }

  /**
   */
  public static final class LibraryServiceStub extends io.grpc.stub.AbstractAsyncStub<LibraryServiceStub> {
    private LibraryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LibraryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LibraryServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBook(com.example.grpc.service.BookRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.service.BookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addBook(com.example.grpc.service.Book request,
        io.grpc.stub.StreamObserver<com.example.grpc.service.BookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBook(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.service.BookListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListBookMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LibraryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LibraryServiceBlockingStub> {
    private LibraryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LibraryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LibraryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.service.BookResponse getBook(com.example.grpc.service.BookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBookMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.service.BookResponse addBook(com.example.grpc.service.Book request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddBookMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.grpc.service.BookListResponse> listBook(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListBookMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LibraryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LibraryServiceFutureStub> {
    private LibraryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LibraryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LibraryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.service.BookResponse> getBook(
        com.example.grpc.service.BookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.service.BookResponse> addBook(
        com.example.grpc.service.Book request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BOOK = 0;
  private static final int METHODID_ADD_BOOK = 1;
  private static final int METHODID_LIST_BOOK = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LibraryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LibraryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BOOK:
          serviceImpl.getBook((com.example.grpc.service.BookRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.service.BookResponse>) responseObserver);
          break;
        case METHODID_ADD_BOOK:
          serviceImpl.addBook((com.example.grpc.service.Book) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.service.BookResponse>) responseObserver);
          break;
        case METHODID_LIST_BOOK:
          serviceImpl.listBook((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.service.BookListResponse>) responseObserver);
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

  private static abstract class LibraryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LibraryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.service.Library.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LibraryService");
    }
  }

  private static final class LibraryServiceFileDescriptorSupplier
      extends LibraryServiceBaseDescriptorSupplier {
    LibraryServiceFileDescriptorSupplier() {}
  }

  private static final class LibraryServiceMethodDescriptorSupplier
      extends LibraryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LibraryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LibraryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LibraryServiceFileDescriptorSupplier())
              .addMethod(getGetBookMethod())
              .addMethod(getAddBookMethod())
              .addMethod(getListBookMethod())
              .build();
        }
      }
    }
    return result;
  }
}
