package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Break:

        for (int i=0; i<=5; i++)
        {
            System.out.println(i);
            System.out.println("The Number Is: " + i);
            System.out.println(" ");

            if (i == 2)
            {
                System.out.println("The Number Is " + i + " So We Are Breaking The Loop");
                break;
            }
        }

        //Continue:

        System.out.println("\n");
        System.out.println("This Section Is For Continue...!!!");

        for (int a=0; a<6; a++)
        {
            if (a==2)
            {
                System.out.println("As the next number is " + a + " the loop will end here.");
                continue;
            }

            System.out.println(a);
            System.out.println("The Number Is " + a);
        }
    }
}
