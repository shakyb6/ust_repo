package com.ust.empapp.model;

public class Developer extends Employee{
    String programmingLanguage;

    public Developer(String name, int employeeID, double salary, String programmingLanguage) {
        super(name, employeeID, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee Details :\nName :"+ name +"\nEmployee ID :"+ employeeID +"\nSalary :"+ salary +"\nProgramming Language :"+ programmingLanguage+"\n");
    }
}
