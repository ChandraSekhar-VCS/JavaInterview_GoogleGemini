package Assignment_39;

public class AgeValidation {
    static void validateAge(int age) {
        if(age < 18){
            throw new IllegalArgumentException("Age must be greater than 18");
        }
        else{
            System.out.println("Age is valid");
        }
    }
}
