package com.company;

import com.sun.security.jgss.GSSUtil;

public class Main {

    static void multiplication(int n)
    {
        for (int i=1; i<=10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    static void pattern1(int n)
    {
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static int recursive_sum(int n)
    {
      if (n == 1)
      {
          return 1;
      }
          return n + recursive_sum(n-1);
    }

    static void pattern2(int n)
    {
        for (int i=n; i>=0; i--)
        {
            for (int j=i; j>=1; j--)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static int fib(int n)
    {
          if(n==1)
          {
              return 0;
          }
          else if (n==2)
          {
              return 1;
          }
          return fib(n-1) + fib(n-2);
    }

    static void pattern1_recursive(int n)
    {
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }



    public static void main(String[] args) {
	// write your code here
        //Generating Multiplication Table:
        System.out.println("Below One Is Multiplication Example:");
        multiplication(7);

        System.out.println(" ");
        //Printing * Pattern.
        System.out.println("Below One Is Printing Patterns Example:");
        pattern1(5);

        System.out.println(" ");
        //Recursive Function For n Natural Numbers:
        System.out.println("Below One Is Printing Sum Of n Natural Numbers Using Recursive Function:");
        int c =  recursive_sum(5);
        System.out.println(c);

        System.out.println(" ");
        // Printing * Pattern In Reverse Order
        System.out.println("Printing * Pattern In Reverse Order:");
        pattern2(5);

        System.out.println(" ");
        // Printing Fibonacci Series:
        System.out.println("Fibonacci Series Is As Follows:");
        int a = fib(7);
        System.out.println(a);

    }
}

