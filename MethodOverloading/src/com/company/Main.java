package com.company;

public class Main {

    //Method Overloading: In this we can have more than one methods having same name.

    static void foo()
    {
        System.out.println("Good Morning");
    }

    static void foo(int a)
    {
        System.out.println("Good Morning " + a + " Dharmil");
    }

    static void change(int [] arr)
    {
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("HAHAHAHAHAHHAHAHAHA");
    }

    public static void main(String[] args) {
	// write your code here
//        tellJoke();
        int [] marks = {1,2,3,4,5};
        change(marks);
        System.out.println("Tha Changed Value At Position 0 is: " + marks[0]);

        foo();
        foo(2000);
    }
}
