package Assignment_26;

import java.util.ArrayList;
import java.util.List;

public class Department {
    String name;
    List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayDepartmentDetails() {
        System.out.println("Department: " + name);
        System.out.println("Employees:");
        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
        }
    }
}
