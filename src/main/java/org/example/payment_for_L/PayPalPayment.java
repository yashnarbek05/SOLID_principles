package org.example.payment_for_L;

public class PayPalPayment implements PayPalProcessor {
    private boolean loggedIn;
    public PayPalPayment(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
    @Override
    public boolean isUserLoggedIn() {
        return loggedIn;
    }
    @Override
    public void processPayment(double amount) {
        if (!isUserLoggedIn()) {
            System.out.println("Please log in to process PayPal payment.");
            return; }
        System.out.println("Processing PayPal payment of $" + amount);
    }
}