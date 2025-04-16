package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {


    public static void main(String[] args) {
        //fire up scanner, this allows user input
        Scanner myScanner = new Scanner(System.in);

        //welcome user to app
        System.out.println("This is a payroll calculator");
        System.out.println("------------------------------------");

        //ask user for name
        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();

        //ask user for hours worked
        System.out.print("Enter your hours worked: ");
        float hoursWorked = myScanner.nextFloat();

        //ask user for pay rate
        System.out.print("Enter your pay rate: ");
        float payRate = myScanner.nextFloat();

        //if/else conditional statement for overtime
        float grossPay;
        float regPay = 40 * payRate;
        float overtimeHours = hoursWorked - 40;
        float overtimePay = overtimeHours * (payRate * 1.5f); //1.5f = float, 1.5 = double

        if (hoursWorked > 40) {
            grossPay = regPay + overtimePay;
        } else {
            grossPay = hoursWorked * payRate;
        }

        //display users name and grosspay
        System.out.println("------------------------------------");
        System.out.println(name + "'s gross pay is: $" + grossPay);
    }
}
