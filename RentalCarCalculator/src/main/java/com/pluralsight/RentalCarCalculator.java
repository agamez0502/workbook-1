package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {

    public static void main(String[] args) {

        //fire up scanner to allow user input
        Scanner myScanner = new Scanner(System.in);

        //welcome user to my app
        System.out.println("Welcome to Alondra's Rental Car Calculator");
        System.out.println("------------------------------------------");

        //display car rental prices
        System.out.println("Basic Car Rental: $29.99");
        System.out.println("Drivers under 25: $38.99");
        System.out.println("**There is a 30% surcharge on the Basic Car Rental for drivers under 25**");
        System.out.println("------------------------------------------");

        //ask user for pickup date
        System.out.print("Pickup date? ");
        String pickUpDate = myScanner.nextLine();

        //ask user for number of days for rental
        System.out.print("Number of days for the rental? ");
        double numDays = myScanner.nextInt();
        myScanner.nextLine();

        double basicCar = 29.99 * numDays;
        double underAge = (basicCar * 0.3) + basicCar;

        //display add-on options
        System.out.println("------------------------------------------");
        System.out.println("Electronic Toll Tag: $3.95/day");
        System.out.println("GPS                : $2.95/day");
        System.out.println("Roadside Assistance: $3.95/day");
        System.out.println("Input (y) or (n) down below to add");
        System.out.println("------------------------------------------");

        //ask user if they want an e toll tag
        System.out.print("Would you like an electronic toll tag at $3.95 per day? ");
        String eTollTag = myScanner.nextLine();

        //ask user if they want gps
        System.out.print("Would you like GPS at $2.95 per day? ");
        String gPS = myScanner.nextLine();

        //ask user if they want roadside assistance
        System.out.print("Would you like roadside assistance at $3.95 per day? ");
        String roadSide = myScanner.nextLine();

        // if/else conditional statement for add-ons
        double addOns = 0;
        if (eTollTag.equalsIgnoreCase("y")) {
            addOns += 3.95 * numDays;
        }
        if (gPS.equalsIgnoreCase("y")) {
            addOns += 2.95 * numDays;
        }
        if (roadSide.equalsIgnoreCase("y")) {
            addOns += 3.95 * numDays;
        }

        //ask user for age
        System.out.println("------------------------------------------");
        System.out.print("How old are you? ");
        double age = myScanner.nextDouble();
        System.out.println("------------------------------------------");

        //if/else conditional statement for age
        if (age < 25) {
            System.out.printf("Your total is: $%.2f\n", underAge + addOns);
        } else {
            System.out.printf("Your total is: $%.2f\n", basicCar + addOns);
        }
    }
}
