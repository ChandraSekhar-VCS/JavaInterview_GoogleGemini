//Assignment 9: Default and Parameterized Constructors
//
//Task: Create a class named Rectangle with two attributes: length and width.
//Create a default constructor that initializes both length and width to 1.
//Create a parameterized constructor that takes length and width as parameters and initializes the attributes.
//Add a method calculateArea() that returns the area of the rectangle.
//In your main method, create two Rectangle objects:
//one using the default constructor and one using the parameterized constructor. Then, print the areas of both rectangles.


package Assignment_9;

public class Rectangle {
    int length;
    int width;
    Rectangle(){
        this.length = 1;
        this.width = 1;
    }
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    int claculateArea(){
        return this.length * this.width;
    }
}
