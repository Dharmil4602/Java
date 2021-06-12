package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter Number: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if (a % 2 == 0)
        {
            System.out.println("Entered Number Is Even");
        }

        else
        {
            System.out.println("Entered Number Is Odd");
        }
    }
}
