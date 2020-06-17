package com.jam.example.paymentservice.server;

import grpc.APIResponse;
import grpc.Card;
import grpc.PaymentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class GrpcClient {

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        PaymentServiceGrpc.PaymentServiceBlockingStub stub = PaymentServiceGrpc.newBlockingStub(channel);

        APIResponse apiResponse = PaymentServiceGrpc.newBlockingStub(channel).enroll(
                Card.newBuilder()
                        .setAmount(1)
                        .setUserId(1)
                        .build());

        System.out.println(apiResponse);

        channel.shutdown();
    }

}
