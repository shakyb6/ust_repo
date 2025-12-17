
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Shibu", 1, 10000);
        Manager manager = new Manager("Alice", 2,20000,5);
        Developer developer = new Developer("John", 3,30000, "Java");
        emp.displayDetails();
        manager.displayDetails();
        developer.displayDetails();
    }
}