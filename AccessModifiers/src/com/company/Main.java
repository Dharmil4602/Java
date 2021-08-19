package com.company;

class C1{
    // public, protected, private, and default (int z one) are access modifiers
    public int x = 5;
    protected int y = 45;
    int z = 46;
    private int n = 2;
    public void meth()
    {
        System.out.println(x);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here

        C1 c = new C1();
        c.meth();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//        System.out.println(c.n); // here we cannot use n which is declared as private in above class. So in same package we can print public, protected, default in main class but we cannot print private in main class.
    }
}
