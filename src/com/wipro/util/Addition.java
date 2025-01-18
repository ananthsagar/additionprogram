package com.wipro.util;

public class Addition {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two integers as inputs.");
            return;
        }

        try {
            // Parse the command-line arguments
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;

            // Display the sum
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid integers as inputs.");
        }
    }
}
