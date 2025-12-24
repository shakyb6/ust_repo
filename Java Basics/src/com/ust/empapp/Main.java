package com.ust.empapp;

import com.ust.empapp.model.Developer;
import com.ust.empapp.model.Employee;
import com.ust.empapp.model.Manager;
import com.ust.empapp.repository.EmployeeRepository;
import com.ust.empapp.repository.EmployeeRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Shibu", 1, 10000);
        Manager manager = new Manager("Alice", 2,20000,5);
        Developer developer = new Developer("John", 3,30000, "Java");

        emp.displayDetails();
        manager.displayDetails();
        developer.displayDetails();

        EmployeeRepository employeeRepo = new EmployeeRepositoryImpl();

        employeeRepo.saveEmployee(emp);
        employeeRepo.saveEmployee(manager);
        employeeRepo.saveEmployee(developer);

//        emp = employeeRepo.findEmployee(1);
//        emp.displayDetails();

        employeeRepo.deleteEmployee(2);

        var emps = employeeRepo.getAllEmployees();

        System.out.println("Employee list After Deletion\n");

        for(Employee employee: emps){
            System.out.println(emps);
            }
        }
    }