package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("This is a calculator");
        System.out.println("----------------------------");

        System.out.print("Enter the first number: ");
        float num1 = myScanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = myScanner.nextFloat();
        System.out.println("----------------------------");

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        myScanner.nextLine();
        System.out.print("Please select an option: ");
        String multiply = myScanner.nextLine();

        float sum = num1 * num2;
        System.out.println("----------------------------");
        System.out.println("The sum is: " + num1 + " * " + num2 + " = " + sum);

    }
}
