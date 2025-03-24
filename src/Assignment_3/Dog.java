//Assignment 3: Class with Behavior
//
//Task: Create a class named Dog with the following attributes:
//String name
//String breed
//Add a method bark() that prints "Woof!"
//Add a method displayDogDetails() that prints the dog's name and breed.
//In your main method, create a Dog object, set its attributes, and call the bark() and displayDogDetails() methods.

package Assignment_3;

public class Dog {
    String name;
    String breed;

    void bark(){
        System.out.println("Woof!");
    }

    void displayDogDetails(){
        System.out.println("Name: "+name);
        System.out.println("Breed: "+breed);
    }
}
