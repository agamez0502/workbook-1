package com.pluralsight;

public class MathApp {

    // this is the main method and where my code will run from
    public static void main(String[] args) {

        /*
        1. Create two variables to represent the salary for Bob and Gary, name them
        bobSalary and garySalary. Create a new variable named
        highestSalary. Determine whose salary is greater using Math.max() and
        store the answer in highestSalary.  Set the initial salary variables to any value
        you want. Print the answer (i.e "The highest salary is …")
         */

        int bobSalary = 55000;
        int garySalary = 100000;

        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is: " + highestSalary);
        System.out.println("-------------------------------------------------------");

        /*
        2. Find and display the smallest of two variables named carPrice and
        truckPrice.  Set the variables to any value you want.
         */

        int carPrice = 32000;
        int truckPrice = 44000;

        System.out.println("The lowest price is: " + Math.min(carPrice, truckPrice));
        System.out.println("-------------------------------------------------------");

        /*
        3. Find and display the area of a circle whose radius is 7.25
         */

        //create a variable to hold our radius
        double circleRadius = 7.25;

        //calculate the area and store the value in a variable called area
        double circleArea = Math.PI * Math.pow(circleRadius, 2);

        //print the output for the user
        System.out.println("The area of the circle is: " + circleArea);
        System.out.println("-------------------------------------------------------");

        /*
        4. Find and display the square root a variable after it is set to 5.0
         */

        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("The square root of " + number + " is: " + squareRoot);
        System.out.println("-------------------------------------------------------");

        /*
        5. Find and display the distance between the points (5, 10) and (85, 50)
         */

        int x1 = 5;
        int x2 = 85;
        int y1 = 10;
        int y2 = 50;

        //calculate the distance using a formula we googled
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        //print out the distance for the user
        System.out.println("The distance between the points is: " + distance);
        System.out.println("-------------------------------------------------------");

        /*
        6. Find and display the absolute (positive) value of a variable after it is set to -3.8
         */

        double x = -3.8;

        double absValue = Math.abs(x);

        //print out the absolute value
        System.out.println("The absolute value of " + x + " is: " + absValue);
        System.out.println("-------------------------------------------------------");

        /*
        7. Find and display a random number between 0 and 1
         */

        System.out.println("A random number between 0 and 1 is: " + Math.random());
        System.out.println("-------------------------------------------------------");
    }

}