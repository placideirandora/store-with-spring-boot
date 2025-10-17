package com.placide.store;

public class StripePaymentService {
    public void processPayment(double amount) {
        System.out.println("Stripe Payment");
        System.out.println("Amount : " + amount);
    }
}
