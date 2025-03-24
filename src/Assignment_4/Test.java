package Assignment_4;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3]; // Create an array of 3 Student objects

        // Initialize each Student object
        students[0] = new Student("A",1);
        students[1] = new Student("B",2);
        students[2] = new Student("C",3);

        for (Student student : students) {
            student.displayStudentDetails();
        }
    }
}
