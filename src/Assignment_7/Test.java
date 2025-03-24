package Assignment_7;

public class Test {
    public static void main(String[] args) {
        double radius = 12.5;
        double length = 26.34;
        double width = 10;

        AreaCalculator areaCalculator = new AreaCalculator();
        double perimeter = areaCalculator.calculateArea(radius);
        double area = areaCalculator.calculateCelsius(length, width);
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }
}
