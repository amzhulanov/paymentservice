package com.jam.example.paymentservice.server;

import com.jam.example.paymentservice.api.PaymentServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class PaymentServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(8080)
                .addService(new PaymentServiceImpl()).build();

        server.start();
        server.awaitTermination();
    }

}
