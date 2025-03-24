package Assignment_32;

public class Test {
    public static void main(String[] args) {
        //Upcasting
        Vehicle vehicle = new Car();
        vehicle.start();

        //Downcasting
        if (vehicle instanceof Car){
            Car car = (Car) vehicle;
            car.drive();
        } else {
            System.out.println("Vehicle is not a car");
        }
    }
}
