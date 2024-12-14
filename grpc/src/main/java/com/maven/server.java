package com.maven;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class server {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080) // Specify the port
                .addService(new DemandPredictionImpl()) // Add your service implementation
                .build();

        server.start(); // Start the server
        System.out.println("Server started, listening on port 8080");

        server.awaitTermination(); // Keep the server running until terminated
    }
}
