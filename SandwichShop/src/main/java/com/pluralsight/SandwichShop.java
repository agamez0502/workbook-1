package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        //fire up the scanner to collect input from user
        Scanner myScanner = new Scanner(System.in);


        double Regular = 5.45;
        double Large = 8.95;
        //double seniorDisc = ((price * 0.2) + price);
        //double kidDisc =

        //welcoming user to my app
        System.out.println("Welcome to Alondra's Sandwich Shop");
        System.out.println("------------------------------------");

        //showing user the sandwich options
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");
        System.out.print("Would you like a (1) or (2)? ");
        int order = myScanner.nextInt();

        double total = 0;
        if (order == 1) {
            total += 5.45;
        } else if (order == 2) {
            total += 8.95;
        } else {
            System.out.println("Error, try again!");
        }

        //ask user for age
        System.out.println("------------------------------------");
        System.out.print("How old are you? ");
        int age = myScanner.nextInt();

        //if/else conditional statements for age
        if (age <= 17) {
            System.out.println("You receive a 10% discount!");
            total = (total - (total * 0.1));
        } else if (age >= 65) {
            System.out.println("You receive a 20% discount!");
            total = (total - (total * 0.2));
        } else { //(age > 17 && age < 65)
            System.out.println("You are not eligible for a discount..");
        }


        System.out.println("------------------------------------");
        System.out.println("Your total is: " + total);

    }
    //static methods for calculating the discount
    //public static int discountMinor(int x)
}
