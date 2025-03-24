package Assignment_26;

public class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
