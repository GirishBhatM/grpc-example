// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: library.proto

package com.example.grpc.service;

public interface BookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.grpc.service.Book)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>double price = 2;</code>
   * @return The price.
   */
  double getPrice();
}
