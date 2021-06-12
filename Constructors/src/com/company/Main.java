package com.company;

class Employee{
       private int id;
       private String name;

       // Now Below One That Is Created Is The Constructor For The Given Class:
       // Note: Constructor Name Is Same As The Class Name.

//    public Employee(){
//         id = 1;
//         name = "Dharmil";
//    }

    public Employee(String myName){
         id = 1;
         name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee e = new Employee("The Great Dharmil");
        System.out.println(e.getName());
        System.out.println(e.getId());
    }
}
