package com.example.library.service;

import java.util.List;

import com.example.grpc.service.Book;
import com.example.grpc.service.BookListResponse;
import com.example.grpc.service.BookRequest;
import com.example.grpc.service.BookResponse;
import com.example.grpc.service.LibraryServiceGrpc;
import com.example.library.repository.LibraryRepository;
import com.google.protobuf.Empty;

import io.grpc.stub.StreamObserver;

public class LibraryServiceImpl extends LibraryServiceGrpc.LibraryServiceImplBase {
	
	@Override
	public void addBook(Book request, StreamObserver<BookResponse> responseObserver) {
		int bookId = LibraryRepository.addBook(request);
		BookResponse bookResponse = BookResponse
				.newBuilder()
				.setId(bookId)
				.setBook(request)
				.build();
		responseObserver.onNext(bookResponse);
		responseObserver.onCompleted();
	}

	@Override
	public void getBook(BookRequest request, StreamObserver<BookResponse> responseObserver) {
		Book book = LibraryRepository.getBook(request.getId());
		BookResponse bookResponse = BookResponse
				.newBuilder()
				.setId(request.getId())
				.setBook(book)
				.build();
		responseObserver.onNext(bookResponse);
		responseObserver.onCompleted();
	}
	
	@Override
	public void listBook(Empty request, StreamObserver<BookListResponse> responseObserver) {
		List<Book> books = LibraryRepository.listBook();
		BookListResponse response = BookListResponse
				.newBuilder()
				.addAllBooks(books)
				.build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	
}
