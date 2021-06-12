package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // While Loop:

        int i = 1;
        while (i <= 3)
        {
            System.out.println(i);
            i++;
        }

        // Do While Loops:

        System.out.println("Do While Loop Starts Here...!!!");

        int a= 2;

        do {
            System.out.println(a);
            a++;
        }while (a<2);

        System.out.println("\n");
        // For Loop:

        System.out.println("For Loop Starts Here...!!!");

        for (int x=1; x<=10; x++)
        {
            System.out.println(x);
        }

        System.out.println(" ");
        System.out.println("Printing Odd Numbers..!!");
        for (int n=6, b=0; b<=n; b++)
        {
            int y = (2*b + 1);
            System.out.println(y);
        }

        System.out.println(" ");
        System.out.println("Decrement Operation..!!!");
        for (int c=5; c>0; c--)
        {
            System.out.println(c);
        }

        System.out.println(" ");
        System.out.println("N Natural Numbers In Reverse Order...!!!");
        for (int y=10; y!=0; y--)
        {
            System.out.println(y);
        }
    }
}
