// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: library.proto

package com.example.grpc.service;

public interface BookResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:example.BookResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>.example.Book book = 2;</code>
   * @return Whether the book field is set.
   */
  boolean hasBook();
  /**
   * <code>.example.Book book = 2;</code>
   * @return The book.
   */
  com.example.grpc.service.Book getBook();
  /**
   * <code>.example.Book book = 2;</code>
   */
  com.example.grpc.service.BookOrBuilder getBookOrBuilder();
}
