package com.company;

class Employee{

    private int salary;
    private String name;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int s) {
        this.salary = s;
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

        Employee e1 = new Employee();

        e1.setName("Dharmil Shah");
        System.out.println("The Name Is " + e1.getName());

         e1.setSalary(1200000);
        System.out.println("Salary Of Mr. " + e1.getName() + " is: " + e1.getSalary());

    }
}
