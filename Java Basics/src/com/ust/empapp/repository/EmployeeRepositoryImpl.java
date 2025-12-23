package com.ust.empapp.repository;

import com.ust.empapp.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    Employee[] employees = new Employee[10];
    public static int current = 0;

    public void saveEmployee(Employee employee) {
        if (current < employees.length)
            employees[current++] = employee;
    }

    public Employee findEmployee(int id) {
        for (int i = 0; i < current; i++) {
            var emp = employees[i];

            if (emp != null && emp.getEmployeeID() == id) {
                return emp;
            }
        }
        return null;


    }
    public void deleteEmployee(int id){
        for (int i = 0; i < current; i++){
            var emp = employees[i];
            if (emp != null && emp.getEmployeeID() == id){
             employees[i] = null;
            }
        }
    }

    public Employee[] getAllEmployees() {
        return employees;
    }
}
