package com.company;

public class Main {

    static int sum(int ...arr)
    {
        int result=0;
        for (int a:arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println("The Sum of 4, 5 is: " + sum(4, 5));
        System.out.println("The Sum of 4, 5, 6 is: " + sum(4, 5, 6));
        System.out.println("The Sum of 4, 5, 7 is: " + sum(4, 5, 7));
        System.out.println("The Sum of 4, 5, 8 is: " + sum(4, 5, 8));
    }
}
