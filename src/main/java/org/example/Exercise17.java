/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise17 {
    public static void main (String []args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a 1 if you are male or a 2 if you are female:");
        double gender = scan.nextDouble();
        double r = 0;
        if(gender == 1)
            r = 0.73;
        else if (gender == 2)
            r = 0.66;

        System.out.println("How many ounces of alcohol did you have?");
        double a = scan.nextDouble();
        System.out.println("What is your weight, in pounds?");
        double w = scan.nextDouble();
        System.out.println("How many hours has it been since your last drink?");
        double h = scan.nextDouble();

        double BAC = ((a * 5.14) / (w * r)) - (0.015 * h);

        System.out.println("Your BAC is " + BAC);

        if(BAC < 0.08)
            System.out.println("It is legal for you to drive.");
        else
            System.out.println("It is not legal for you to drive.");
    }
}