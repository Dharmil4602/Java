package com.company;

class A{
    public int a;
    public int dharmil(){
        return 2;
    }

    public void method1()
    {
        System.out.println("I Am Method2");
    }
}

class B extends A{

    public void method1()
    {
        System.out.println("I Am Method3"); //Override the method1 of class A
    }

    public void method2()
    {
        System.out.println("I Am Method3");
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here
        A a = new A();
        a.method1();

        B b = new B();
        b.method1();
    }
}
