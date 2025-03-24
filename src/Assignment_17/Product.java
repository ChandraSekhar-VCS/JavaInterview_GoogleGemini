package Assignment_17;

public class Product {
    int id;
    String name;
    double price;
    Product(int id){
        this.id = id;
        name = "Unknown";
        price = 0.0;
    }
    Product(int id, String name){
        this(id);
        this.name = name;
        price = 0.0;
    }
    Product(int id, String name, double price){
        this(id,name);
        this.price = price;
    }

    void displayProductDetails(){
        System.out.println("id :" + id);
        System.out.println("name :" + name);
        System.out.println("price :" + price);
    }
}
