package com.ust.empapp;

import com.ust.empapp.exception.DuplicateEmployeeException;
import com.ust.empapp.exception.EmployeeNotFoundException;
import com.ust.empapp.model.Developer;
import com.ust.empapp.model.Employee;
import com.ust.empapp.model.Manager;
import com.ust.empapp.repository.EmployeeRepository;
import com.ust.empapp.repository.EmployeeRepositoryImpl;

import java.io.FileWriter;
import java.io.Writer;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 2,20000,5);
        Developer developer = new Developer("John", 3,30000, "Java");

        manager.displayDetails();
        developer.displayDetails();

        EmployeeRepository employeeRepo = new EmployeeRepositoryImpl();

        employeeRepo.saveEmployee(manager);
        employeeRepo.saveEmployee(developer);

//        emp = employeeRepo.findEmployee(1);
//        emp.displayDetails();

        employeeRepo.deleteEmployee(2);

        List<Employee> emps = employeeRepo.getAllEmployees();

        System.out.println("Employee list After Deletion\n");

        for(Employee employee: emps){
            employee.displayDetails();
            }

        try {
            var emp = employeeRepo.findEmployee(110);
            emp.displayDetails();
        }
        catch (EmployeeNotFoundException ex){
            System.err.println(ex.getMessage());
        }

        Developer developer1 = new Developer("Sibu", 3,30000, "Java");

        try {
            employeeRepo.saveEmployee(developer1);
        }
        catch (DuplicateEmployeeException ex){
            System.err.println(ex.getMessage());
        }


        //All Employees sorted by name
//        List<Employee> em = employeeRepo.sortByName();
//
//        try(Writer writer = new FileWriter("Details.txt",true)){
//            em.forEach(employee ->writer.append(employee));
//        }
//        catch (Exception ex){
//
//        }
//
//        // Highest paid employee
//
//        Employee e1 = employeeRepo.findHighestPaidEmployee();
//        try(Writer writer = new FileWriter("Details.txt",true)){
//            writer.append("\nHighest Paid Employee: "+e1);
//        }
//        catch (Exception ex){
//
//        }

        // Max Sal | Min Sal | Avg Sal




        }
    }