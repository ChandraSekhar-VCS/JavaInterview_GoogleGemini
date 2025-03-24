package Assignment_40;

public class Test {
    public static void main(String[] args) {
        try{
            SquareRootCalculator.claculateSquareRoot(-100);
        }
        catch(IllegalArgumentException e){
            System.out.println("The input is negative");
        }
        try{
            double result = SquareRootCalculator.claculateSquareRoot(100);
            System.out.println(result);
        }
        catch(IllegalArgumentException e){
            System.out.println("The input is negative");
        }
    }
}
