// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: library.proto

package com.example.grpc.service;

public final class Library {
  private Library() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_service_BookRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_service_BookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_service_BookResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_service_BookResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_service_Book_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_service_Book_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_service_BookListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_service_BookListResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rlibrary.proto\022\030com.example.grpc.servic" +
      "e\032\033google/protobuf/empty.proto\"\031\n\013BookRe" +
      "quest\022\n\n\002id\030\001 \001(\005\"H\n\014BookResponse\022\n\n\002id\030" +
      "\001 \001(\005\022,\n\004book\030\002 \001(\0132\036.com.example.grpc.s" +
      "ervice.Book\"#\n\004Book\022\014\n\004name\030\001 \001(\t\022\r\n\005pri" +
      "ce\030\002 \001(\001\"A\n\020BookListResponse\022-\n\005books\030\001 " +
      "\003(\0132\036.com.example.grpc.service.Book2\217\002\n\016" +
      "LibraryService\022X\n\007getBook\022%.com.example." +
      "grpc.service.BookRequest\032&.com.example.g" +
      "rpc.service.BookResponse\022Q\n\007addBook\022\036.co" +
      "m.example.grpc.service.Book\032&.com.exampl" +
      "e.grpc.service.BookResponse\022P\n\010listBook\022" +
      "\026.google.protobuf.Empty\032*.com.example.gr" +
      "pc.service.BookListResponse0\001B\034\n\030com.exa" +
      "mple.grpc.serviceP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_com_example_grpc_service_BookRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_service_BookRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_service_BookRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_example_grpc_service_BookResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_service_BookResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_service_BookResponse_descriptor,
        new java.lang.String[] { "Id", "Book", });
    internal_static_com_example_grpc_service_Book_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_grpc_service_Book_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_service_Book_descriptor,
        new java.lang.String[] { "Name", "Price", });
    internal_static_com_example_grpc_service_BookListResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_grpc_service_BookListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_service_BookListResponse_descriptor,
        new java.lang.String[] { "Books", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
