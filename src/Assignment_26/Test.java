package Assignment_26;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102);
        Employee emp3 = new Employee("Charlie", 103);

        Department sales = new Department("Sales");
        sales.addEmployee(emp1);
        sales.addEmployee(emp2);

        Department engineering = new Department("Engineering");
        engineering.addEmployee(emp3);

        sales.displayDepartmentDetails();
        System.out.println("---"); // Separator
        engineering.displayDepartmentDetails();
    }
}
