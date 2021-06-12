package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // Printing Stars:
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }

        //Sum of n even numbers:

        System.out.println(" ");
        int sum = 0;
        for (int a = 0; a < n; a++) {
            sum = sum + (2 * a);
        }
        System.out.println("The Summation Is: " + sum);

        //Multiplication:

        System.out.println("\n");
        System.out.println("Multiplication Table Of 10 is: ");
        int y = 10;
        int mult = 0;
        for (int x = 1; x <= 10; x++) {
            mult = (10 * x);
            System.out.println("10 * " + x + " = " + mult);
        }

        // Printing Factorial:

        System.out.println(" ");
        System.out.println("Factorial Example...!!");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number You Want Factorial Of: ");
        int t = s.nextInt();
        int fact =1;
        for (int i = 1; i <= t; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial Of " + t + " is: " + fact);

    }
}
