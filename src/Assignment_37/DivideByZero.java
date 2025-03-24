package Assignment_37;

public class DivideByZero {
    public static void main(String[] args) {
        int A = 25;
        int B = 0;
        int C = 1;
        try{
            int result = A / B;
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        finally {
            System.out.println("Exception has occurred finally block is executed");
        }

        try{
            int result = A/C;
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        finally {
            System.out.println("NO Exception has occurred finally block is executed");
        }
    }
}
