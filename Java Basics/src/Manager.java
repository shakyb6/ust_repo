public class Manager extends Employee{
    int teamSize;
    public Manager(String name, int employeeID, double salary, int teamSize){
        super(name, employeeID, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        System.out.println("Employee Details :\nName :"+ name +"\nEmployee ID :"+ employeeID +"\nSalary :"+ salary +"\nTeam Size :"+ teamSize+"\n");
    }
}
