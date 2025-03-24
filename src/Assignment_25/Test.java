package Assignment_25;

public class Test {
    public static void main(String[] args) {
        Address address = new Address("Bharathpet","Guntur","India");
        Employee employee = new Employee("Chandra",address);

        employee.display();
    }
}
