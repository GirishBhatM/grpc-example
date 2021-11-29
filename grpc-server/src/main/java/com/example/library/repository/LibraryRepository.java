package com.example.library.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.grpc.service.Book;

public class LibraryRepository {

	private static final Map<Integer, Book> LIBRARY = new HashMap<>();
	private static int ID = 0;

	public static int addBook(Book book) {
		int id = ID++;
		LIBRARY.put(id, book);
		return id;
	}
	
	public static Book getBook(int id) {
		return LIBRARY.get(id);
	}
	
	public static List<Book> listBook(){
		return new ArrayList<>(LIBRARY.values());
	}

}
