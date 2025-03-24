package Assignment_22;

public class Shape {
    int length;
    int width;
    Shape(int length, int width){
        this.length = length;
        this.width = width;
    }
    public Shape() {

    }
    void area(){
        System.out.println("Area : " + (length * width));
    }
}
