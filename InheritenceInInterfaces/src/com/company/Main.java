package com.company;

interface sample
{
    void meth1();
    void meth2();
}

// We can apply inheritence (extends) in interface but during class we need to apply implements. In below one, the first one represents class and second one represents interface
//class sample1 extends sample
interface sample1 extends sample
{
    void meth3();
    void meth4();
}

class mySampleClass implements sample1
{
    public void meth1() {
        System.out.println("This Is Meth1");
    }
    public void meth2() {
        System.out.println("This Is Meth2");
    }
    public void meth3() {
        System.out.println("This Is Meth3");
    }
    public void meth4() {
        System.out.println("This Is Meth4");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        mySampleClass obj = new mySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
