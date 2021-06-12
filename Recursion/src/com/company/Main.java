package com.company;

import java.util.Scanner;

public class Main {

    static int factorial_recursion(int a) {

        if (a == 0 || a == 1)
        {
            return 1;
        }

        else
        {
            return a * factorial_recursion((a - 1));
        }
    }

    static int factorial_iterative(int a)
    {

        int fact = 1;
        if (a == 0 || a == 1)
        {
            return 1;
        }
        else
        {
            for (int i = a; i >= 1; i--)
            {
                fact *= i;
            }
            return fact;
         }
    }


    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter The Number You Want Factorial Of: ");
        int x;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        System.out.println("Factorial Of " + x + " with recursion method is: " + factorial_recursion(x));
        System.out.println("Factorial Of " + x + " with iterative method is: " + factorial_iterative(x));
    }
}
