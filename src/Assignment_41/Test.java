package Assignment_41;

public class Test {
    static void validatAge(int age)  throws InvalidInputException {
        if(age < 18){
            throw  new InvalidInputException("Invalid Age");
        }
        else{
            System.out.println("valid age");
        }
    }

    public static void main(String[] args) {
        try{
            validatAge(19);
        }
        catch (InvalidInputException e){
            System.out.println(e.getMessage());
        }

        try{
            validatAge(17);
        }
        catch (InvalidInputException e){
            System.out.println(e.getMessage());
        }
    }
}
