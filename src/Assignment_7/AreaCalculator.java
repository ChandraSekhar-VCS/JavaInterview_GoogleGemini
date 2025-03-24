//Assignment 7: Method Overloading
//
//Task: Create a class named AreaCalculator with two overloaded methods named calculateArea().
//One method should take the radius of a circle as a parameter and return its area (Area = π * radius^2).
//The other method should take the length and width of a rectangle as parameters and return its area.
//In your main method, create an instance of AreaCalculator, call both calculateArea() methods with appropriate parameters, and print the results.

package Assignment_7;

public class AreaCalculator {
    double calculateArea(double radius){
        double area = 3.14 * radius * radius;
        return area;
    }

    double calculateCelsius(double length, double width){
        double area = length * width;
        return  area;
    }
}
