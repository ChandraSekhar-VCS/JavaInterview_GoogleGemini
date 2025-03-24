package Assignment_1;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.make = "BMW";
        car1.model = "M1";
        car1.year = 2015;
        car2.make="Ford";
        car2.model="M2";
        car2.year=2020;
        car1.displayCarDetails();
        car2.displayCarDetails();
    }
}
