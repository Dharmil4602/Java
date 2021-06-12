package com.company;

class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println("This Is Example For Creating Our Own Java Class: ");
          Employee emp1 = new Employee();
          emp1.setName("Dharmil");
          emp1.salary = 12000000;

        System.out.println(emp1.getName());
        System.out.println("Salary Of " + emp1.getName() + " is " + emp1.getSalary());


    }
}