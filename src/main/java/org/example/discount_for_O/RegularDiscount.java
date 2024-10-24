package org.example.discount_for_O;

public class RegularDiscount extends Discount {
    public double calculate(double amount) {
        return amount * 0.1;
    }
}
