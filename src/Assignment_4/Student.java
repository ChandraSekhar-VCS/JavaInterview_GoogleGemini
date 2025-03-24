//Assignment 4: Multiple Objects
//
//Task: Create a class named Student with the following attributes:
//String name
//int rollNumber
//Add a method displayStudentDetails() that prints the student's name and roll number.
//In your main method, create an array of Student objects (e.g., an array of size 3).
//Initialize each Student object with different names and roll numbers.
//Loop through the array and call the displayStudentDetails() method for each student.

//Assignment 8: Method to manipulate object data.
//
//        Task: Add a method to the Student class created in assignment 4 called updateRollNumber(int newRollNumber).
//        this method should update the roll number of the student object.
//In the main method of your test class, create a student object, display its details, update its roll number using
// the new method, and then display the updated details.

package Assignment_4;

public class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void displayStudentDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollNumber);
    }

    void updateRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }
}
