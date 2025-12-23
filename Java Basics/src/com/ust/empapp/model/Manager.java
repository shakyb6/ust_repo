package com.ust.empapp.model;

public class Manager extends Employee{
    int teamSize;
    public Manager(String name, int employeeID, double salary, int teamSize){
        super(name, employeeID, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee Details :\nName :"+ name +"\nEmployee ID :"+ employeeID +"\nSalary :"+ salary +"\nTeam Size :"+ teamSize+"\n");
    }
}
