package com.wipro.util;

public class Addition {
    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }

        try {
            // Parse the arguments as integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid integers.");
        }
    }
}
