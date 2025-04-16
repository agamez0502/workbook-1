package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        //fire up the scanner to collect input from user
        Scanner myScanner = new Scanner(System.in);

        //welcome user to my app
        System.out.println("Welcome to Alondra's Sandwich Shop");
        System.out.println("------------------------------------");

        //show user the sandwich options and ask them to input 1 or 2
        System.out.println("1: Regular: starts out at $5.45");
        System.out.println("2: Large  : starts out at $8.95");
        System.out.print("Would you like a (1) or (2)? ");
        int order = myScanner.nextInt();

        //if/else conditional statements for order
        double total = 0;
        if (order == 1) {
            total += 5.45;
        } else if (order == 2) {
            total += 8.95;
        } else {
            System.out.println("Error, try again!");
        }

        //eats the carriage, allowing us to switch between different methods for user input
        myScanner.nextLine();

        //show user the loaded sandwich prices and ask them if they want the sandwich loaded (y) or not (n)
        System.out.println("------------------------------------");
        System.out.println("Regular: $1.00 extra charge");
        System.out.println("Large  : $1.75 extra charge");
        System.out.print("Would you like your sandwich loaded (y) or (n)? ");
        String loaded = myScanner.nextLine();

        //if/else conditional statements for loaded
        double loadedPrice = 0;
        if (loaded.equalsIgnoreCase("y")) {

            
            if (order == 1) {
                loadedPrice = 1.00;
            } else if (order == 2) {
                loadedPrice = 1.75;
            }
        }

//        if (loaded == "y" && order == 1) {
//            total += 1.00 + total; //$6.45
//            System.out.println("That will be an additional $1.00");
//        } else if (loaded == "y" && order == 2) {
//            total += 1.75 + total; //$10.70
//            System.out.println("That will be an additional $1.75");
//        } else {
//            System.out.println("Your sandwich will not be loaded");
//        }

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
            System.out.println("You are not eligible for a discount");
        }

        //display total
        total = total + loadedPrice;

        System.out.println("------------------------------------");
        System.out.println("Thank you for ordering with us, your order will be ready in 5 minutes!");
        System.out.printf("Your total is $%.2f ", total);
        System.out.println("\n------------------------------------");
    }
    //static methods for calculating the discount
    //public static int discountMinor(int x)
}
