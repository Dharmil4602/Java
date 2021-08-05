package com.company;

// Example 1:
abstract class Pen{
    abstract void Write();

    abstract void Refill();
}

class FountainPen extends Pen{

    void Write() {
        System.out.println("This Is Write");
    }

    void Refill() {
        System.out.println("This Is Refill");
    }

    void ChangeNip(){
        System.out.println("Changeing The Nip");
    }
}

// Example 2:

interface BasicAnimal
{
    void Eat();
    void Sleep();
}

class Monkey
{
    void jump()
    {
        System.out.println("Monkey Jumps");
    }

    void Bite()
    {
        System.out.println("Monkey Bites");
    }
}

class Human extends Monkey implements BasicAnimal
{

    public void Speak()
    {
        System.out.println("Human Is Speaking");
    }

    public void Eat()
    {
        System.out.println("Eating..!!");
    }

    public void Sleep()
    {
        System.out.println("Sleeping...!!!");
    }
}
// Main Class

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Example 1:
        FountainPen pen = new FountainPen();
        pen.Refill();

        //Example 2:
        Human human = new Human();
        human.Eat();

        Monkey m1 = new Human();
//        m1.speak(); // --> Cannot implement speak method as it is not the part of Monkey class.
    }
}
