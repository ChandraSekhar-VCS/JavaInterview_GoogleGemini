package Assignment_30;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        shapes[0].draw();
        shapes[1].draw();
        shapes[2].draw();
    }
}
