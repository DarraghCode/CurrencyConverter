package com.DarraghLearning;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        currency();
    }

    private static void currency() {
        // Declare the choices for the Users
        System.out.println("What would you like to covert?");
        System.out.println("1. EUR to USD?");
        System.out.println("2. USD to EUR?");
        System.out.println("Your Choice: ");

        //Gather the users input
        Scanner sc = new Scanner(System.in);

        //Giving the input a variable that is an integer
        int option = sc.nextInt();

        //Assigning the value to a float in the event there's small change.
        //We also assume the currency is going to be euro.
        float EUR;

        if (option == 1) {
            EUR = 1.12F;
            System.out.println("Enter the amount of EUR to be converted to USD: ");
            // Calculate the total from the USD amount to EUR.
            System.out.println("USD: " + sc.nextFloat() * EUR);
        } else if (option == 2) {
            EUR = 0.88F;
            System.out.println("Enter the amount of USD to be converted to EUR: ");
            // Calculate the total from EUR amount to USD.
            System.out.println("EUR: " + sc.nextFloat() * EUR);
        } else if (option < 1 || option > 2) {
            System.out.println("Please choose between 1 or 2");
        }

    }
}
