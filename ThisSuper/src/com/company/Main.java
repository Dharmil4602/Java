package com.company;

class Ekclass{
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int v)
    {
        a = v;
    }

    public int returnNone()
    {
        return 1;
    }
}

class Doclass extends Ekclass{
    Doclass(int z)
    {
        super(z);
        System.out.println("I am a constructor");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Ekclass e = new Ekclass(5);
        System.out.println(e.getA());
        Doclass d = new Doclass(6);
    }
}
