package org.example.payment_for_L;

public interface PayPalProcessor extends PaymentProcessor {
    boolean isUserLoggedIn();
}
