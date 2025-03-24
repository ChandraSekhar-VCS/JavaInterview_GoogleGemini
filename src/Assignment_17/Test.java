package Assignment_17;

public class Test {
    public static void main(String[] args) {
        Product p1 = new Product(001);
        Product p2 = new Product(002,"Pen");
        Product p3 = new Product(003,"Pen",10.0);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();
    }
}
