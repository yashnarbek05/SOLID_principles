package org.example.discount_for_O;

// PremiumDiscount.java
public class PremiumDiscount extends Discount {
    public double calculate(double amount) {
        return amount * 0.2;
    }
}