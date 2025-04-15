package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {

    public static void main(String[] args) {

        //firing up scanner to allow user input
        Scanner myScanner = new Scanner(System.in);

        //welcoming user to my app
        System.out.println("Welcome to Alondra's Rental Car Calculator");
        System.out.println("------------------------------------------");

        //displaying car rental prices
        System.out.println("Basic Car Rental: $29.99");
        System.out.println("Drivers under 25: $38.99");
        System.out.println("**There is a 30% surcharge on the Basic Car Rental for drivers under 25**");
        System.out.println("------------------------------------------");

        //asking user for p/u date
        System.out.print("Pickup date? ");
        String pickUpDate = myScanner.nextLine();

        //asking user for num of days for rental
        System.out.print("Number of days for the rental? ");
        double numDays = myScanner.nextInt();

        double basicCar = 29.99 * numDays;
        double underAge = (basicCar * 0.3) + basicCar;

        double tolltag = 3.95;
        double gps = 2.95;
        double roadside = 3.95;

        //displaying add-on options
        System.out.println("------------------------------------------");
        System.out.println("Electronic Toll Tag: $3.95/day");
        System.out.println("GPS                : $2.95/day");
        System.out.println("Roadside Assistance: $3.95/day");
        System.out.println("Input (y) or (n) down below to add");
        System.out.println("------------------------------------------");

        //asking user if they want an e toll tag
        System.out.print("Would you like an electronic toll tag at $3.95 per day? ");
        String eTollTag = myScanner.nextLine();

        //asking user if they want gps
        myScanner.nextLine();
        System.out.print("Would you like GPS at $2.95 per day? ");
        String gPS = myScanner.nextLine();

        //asking user if they want roadside assistance
        System.out.print("Would you like roadside assistance at $3.95 per day? ");
        String roadSide = myScanner.nextLine();

        // if/else statement for add-ons
        double addOns = 0;
        if (eTollTag.equalsIgnoreCase("y")) {
            addOns += 3.95;
        }
        if (gPS.equalsIgnoreCase("y")) {
            addOns += 2.95;
        }
        if (roadSide.equalsIgnoreCase("y")) {
            addOns += 3.95;
        }

        //asking user for age
        System.out.println("------------------------------------------");
        System.out.print("How old are you? ");
        double age = myScanner.nextDouble();
        System.out.println("------------------------------------------");

        //if/else statement for age
        if (age < 25) {
            System.out.println("Your total is: " + underAge);
        }
        else {
            System.out.println("Your total is: " + basicCar);
        }
    }
}
