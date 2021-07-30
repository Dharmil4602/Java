package com.company;

abstract class Base2{
   public Base2(){
       System.out.println("Mai ek Base2 Constructor hu..!!");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();

}

class Base1 extends Base2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}

abstract class Base3 extends Base2{
    public void th(){
        System.out.println("Good Afternoon");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
          Base1 b = new Base1();
//          Base3 p = new Base3();
          }

    }

