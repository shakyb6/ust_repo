package com.ust.empapp.model;

public class Employee {
    protected String name;
    protected int employeeID;
    protected double salary;

    public Employee(String name, int employeeID, double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println("Employee Details :\nName :"+ name +"\nEmployee ID :"+ employeeID +"\nSalary :"+ salary+"\n");
    }
}
