package com.example.library.server;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.library.service.LibraryServiceImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class LibraryServer {

	private static final Logger LOG = Logger.getLogger(LibraryServer.class.getName());
	
	private Server server;
	
	public void startServer() {
		try {
			this.server = ServerBuilder
					.forPort(50051)
					.addService(new LibraryServiceImpl())
					.build()
					.start();
			LOG.info("Server started at 50051");
		} catch (IOException e) {
			LOG.log(Level.SEVERE," error occured while starting server", e);
		}
	}
	
	public void stopServer() {
		if(null != this.server){
			try {
				this.server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
			}
		}
	}
	
	public void blockUntilShutDown() {
		if(null != this.server) {
			try {
				this.server.awaitTermination();
			} catch (InterruptedException e) {
			}
		}
	}
	
	public static void main(String[] args) {
		LibraryServer libraryServer = new LibraryServer();
		libraryServer.startServer();
		libraryServer.blockUntilShutDown();
	}
}
