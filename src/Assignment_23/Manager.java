package Assignment_23;

public class Manager extends Employee{
    String department;
    Manager(String name, double salary,String department){
        super(name, salary);
        this.department = department;
    }
    void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Department: " + this.department);
    }
}
