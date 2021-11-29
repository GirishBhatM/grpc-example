package com.example.grpc.library.client;

import java.util.logging.Logger;

import com.example.grpc.service.Book;
import com.example.grpc.service.BookResponse;
import com.example.grpc.service.LibraryServiceGrpc;
import com.example.grpc.service.LibraryServiceGrpc.LibraryServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class LibraryClient {
	
	private static final Logger LOG = Logger.getLogger(LibraryClient.class.getName());
	
	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder
				.forTarget("localhost:50051")
				.usePlaintext()
				.build();
		
		LibraryServiceBlockingStub libraryServiceBlockingStub = LibraryServiceGrpc.newBlockingStub(channel);
		BookResponse bookResponse = libraryServiceBlockingStub.addBook(Book
				.newBuilder()
				.setName("Mankutimmana Kagga")
				.setPrice(200.0)
				.build());
		LOG.info("added book id : "+bookResponse.getId()+ " name:"+bookResponse.getBook().getName());
		
		bookResponse = libraryServiceBlockingStub.addBook(Book
				.newBuilder()
				.setName("Panchatantra")
				.setPrice(100.0)
				.build());
		LOG.info("added book id : "+bookResponse.getId()+ " name:"+bookResponse.getBook().getName());
		
	}

}
