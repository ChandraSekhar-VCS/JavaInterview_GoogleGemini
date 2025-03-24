package Assignment_22;

public class Circle extends Shape{
    double radius;
    Circle(int radius){
        super();
        this.radius = radius;
    }
    void area(){
        System.out.println("Area of Circle : " + (2.341*radius*radius));
    }
}
