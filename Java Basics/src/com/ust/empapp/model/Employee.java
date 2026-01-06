package com.ust.empapp.model;

public abstract class Employee implements Comparable<Employee> {
    protected String name;
    protected int employeeID;
    protected double salary;

    public Employee(String name, int employeeID, double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee Details :\nName :"+ name +"\nEmployee ID :"+ employeeID +"\nSalary :"+ salary+"\n");
    }

    public int compareTo(Employee e){
        return Double.compare(salary,e.salary);
    }

}
