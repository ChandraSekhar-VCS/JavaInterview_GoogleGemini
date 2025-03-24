//public class Example {
//    String studentName;
//    int rollNumber;
//
//    Example(){
//        sout("No args constructor is called");
//    }
//    Example(String studentName, int rollNumber){
//        this();
//        this.studentName = studentName;
//        this.rollNumber = rollNumber;
//    }
//}
//
//class S{
//    void m(S s){
//        System.out.println("Inside m() method");
//    }
//    void n(){
//        m(this);
//    }
//}
//
//class A{
//    A getA(){
//        return this;
//    }
//}


//class ParentExample{
//    void print(){
//        System.out.println("this is parent print");
//    }
//}
//
//class ChildExample extends ParentExample{
//    void print(){
//        System.out.println("this is child print");
//    }
//}

//class Employee{
//    String name;
//    double salary;
//    Address address;
//}
//
//class Address{
//    String street;
//    String city;
//    String state;
//    int zip;
//}

//class addition{
//    int add(int a,int b){
//        return a+b;
//    }
//    int add(int a, int b,int c){
//        return a+b+c;
//    }
//}
//
//class Bike{
//    void run(){
//        System.out.println("Bike is running");
//    }
//}
//class Splendor extends Bike{
//    void run(){
//        System.out.println("Splendor is running");
//    }
//}
//
//class Test{
//    public static void main(String[] args) {
//        Bike bike = new Splendor();
//        bike.run();
//    }
//}

//class TryCatchExample{
//    public static void main(String[] args) {
//        try{
//            int data = 50/0; // here this causes an Arithmetic exception
//        }
//        catch(ArithmeticException e){
//            System.out.println(e);
//        }
//    }
//}

//class ThrowExample{
//    public static void main(String[] args) {
//        validateAge(15);
//    }
//    public static void validateAge(int age){
//        if(age < 18){
//            throw new ArithmeticException("Invalid Age");
//        }
//        else{
//            System.out.println("Valid Age");
//        }
//    }
//}
//
//class InvalidAgeException extends Exception{
//    public InvalidAgeException(String message){
//        super(message);
//    }
//}
//class TestCustomException{
//    static void validateAge(int age) throws InvalidAgeException{
//        if(age<18){
//            throw new InvalidAgeException("Age is invalid it must be greater than 18");
//        }
//        else{
//            System.out.println("Eligible to vote");
//        }
//    }
//
//    public static void main(String[] args) {
//        try{
//            TestCustomException.validateAge(13);
//        }
//        catch(InvalidAgeException e){
//            System.out.println(e);
//        }
//    }
//}

