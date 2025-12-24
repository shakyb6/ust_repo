package com.ust.empapp.repository;
import com.ust.empapp.model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    List<Employee> employees = new ArrayList<>();

    public void saveEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findEmployee(int id) {
        for (Employee employee: employees){
            if (employee.getEmployeeID() == id){
                return employee;
            }
        }
        return null;
    }
    public void deleteEmployee(int id){
        Employee employee = findEmployee(id);
        employees.remove(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }
}
