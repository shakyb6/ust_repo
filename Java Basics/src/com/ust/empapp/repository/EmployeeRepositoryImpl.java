package com.ust.empapp.repository;
import com.ust.empapp.model.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    List<Employee> employees = new ArrayList<>();

    public void saveEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findEmployee(int id) {
//        for (Employee employee: employees){
//            if (employee.getEmployeeID() == id){
//                return employee;
//            }
//        }
//        return null;
        Employee emp = employees.stream().filter(n-> n.getEmployeeID() == id)
                .findFirst().orElse(null);

        return emp;
    }

    public void deleteEmployee(int id){
//        Employee employee = findEmployee(id);
//        employees.remove(employee);

        employees.removeIf(n -> n.getEmployeeID() == id);

    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee findEmployeeByName(String name){
//        for (Employee employee: employees){
//            if ((employee.getName()).equals(name)){
//                return employee;
//            }
//        }
//        return null;
        Employee employee = employees.stream().filter(n -> n.getName().equalsIgnoreCase(name))
                .findFirst().orElse(null);

        return employee;
    }

    public List<Employee> findEmployeeInSalaryRange(double min, double max) {
//        List<Employee> list = new ArrayList<>();
//        for (var emp : employees) {
//            if (emp.getSalary() >= min && emp.getSalary() <= max) {
//                list.add(emp);
//            }
//        }
//        return list;
        List<Employee> list = employees.stream()
                .filter(n -> n.getSalary() >= min && n.getSalary() <= max).collect(Collectors.toList());
        return list;
    }

    public List<Employee> sortBySalary(){
        return employees.stream()
                .sorted((e1,e2) ->Double.compare(e1.getSalary(),e2.getSalary())).toList();
    }

    public List<Employee> sortByName(){
        return employees.stream()
                .sorted((e1,e2) -> e1.getName().compareToIgnoreCase(e2.getName())).toList();
    }

    public Employee findHighestPaidEmployee(){
//        Employee high = null;
//        if(!employees.isEmpty()){
//            high = employees.get(0);
//            for(Employee emp: employees){
//                if(emp.getSalary() > high.getSalary()){
//                    high = emp;
//                }
//            }
//        }
//        return high;
        return employees.stream().max((e1,e2) ->Double.compare(e1.getSalary(),e2.getSalary())).get();
    }

}
