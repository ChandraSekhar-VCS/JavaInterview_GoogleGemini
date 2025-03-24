package Assignment_10;

public class Test {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("VCS","VCS");
        Book b3 = new Book("VCS","VCS",100);

        b1.displayBookDetails();
        b2.displayBookDetails();
        b3.displayBookDetails();
    }
}
