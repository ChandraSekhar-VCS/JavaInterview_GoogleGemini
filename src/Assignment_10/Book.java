package Assignment_10;

public class Book {
    String title;
    String author;
    int pages;

    Book(){
        this.title = "";
        this.author = "";
        this.pages = 0;
    }

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBookDetails(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Pages: " + this.pages);
    }
}
