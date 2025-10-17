package com.placide.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(StoreApplication.class, args);
        var orderService = new OrderService(new StripePaymentService());
        var paypalService = new OrderService(new PaypalPaymentService());

        orderService.placeOrder(10.5);
        paypalService.placeOrder(20.8);
	}


}
