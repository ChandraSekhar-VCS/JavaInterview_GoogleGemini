package Assignment_25;

public class Employee {
    String name;
    Address address;

    Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Street :" + address.street);
        System.out.println("City : " + address.city);
        System.out.println("Country : " + address.country);
    }
}
