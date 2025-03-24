package Assignment_16;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void diaplay(){
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }
}
