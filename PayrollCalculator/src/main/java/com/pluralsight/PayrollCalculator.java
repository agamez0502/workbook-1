package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {


    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("This is a payroll calculator");
        System.out.println("------------------------------------");

        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();

        System.out.print("Enter your hours worked: ");
        float hoursWorked = myScanner.nextFloat();

        System.out.print("Enter your pay rate: ");
        float payRate = myScanner.nextFloat();

        float grossPay = hoursWorked * payRate;
        System.out.println("------------------------------------");
        System.out.println(name + "'s gross pay is: " + grossPay);

    }
}
