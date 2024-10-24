package org.example;

import org.example.discount_for_O.Discount;
import org.example.discount_for_O.DiscountCalculator;
import org.example.discount_for_O.PremiumDiscount;
import org.example.discount_for_O.RegularDiscount;
import org.example.switch_manager_for_D.LightBulb;
import org.example.switch_manager_for_D.Switch;
import org.example.switch_manager_for_D.Switchable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Discount regularDiscount = new RegularDiscount();
        Discount premiumDiscount = new PremiumDiscount();
        DiscountCalculator calculator = new DiscountCalculator();
        double regularDiscountAmount = calculator.calculateDiscount(
                regularDiscount, 100);
        double premiumDiscountAmount = calculator.calculateDiscount(
                premiumDiscount, 100);
        System.out.println("Regular Discount: " + regularDiscountAmount);
        System.out.println("Premium Discount: " + premiumDiscountAmount);

        Switchable device = new LightBulb();

        Switch lswitch = new Switch(device);

        lswitch.operator();




    }
}