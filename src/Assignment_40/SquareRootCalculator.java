package Assignment_40;

public class SquareRootCalculator {
    static double claculateSquareRoot(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Number is negative");
        }
        else{
            return Math.sqrt(number);
        }
    }
}
