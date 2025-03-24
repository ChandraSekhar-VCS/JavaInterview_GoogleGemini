package Assignment_9;

public class Test {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle(20,30);

        int R1_area = R1.claculateArea();
        int R2_area = R2.claculateArea();

        System.out.println("Area of Rectangle is: " + R1_area);
        System.out.println("Area of Rectangle is: " + R2_area);
    }

}
