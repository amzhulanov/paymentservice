package com.jam.example.paymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.jam"})
public class PaymentServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApp.class, args);
	}

}
