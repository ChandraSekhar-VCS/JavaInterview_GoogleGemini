package Assignment_12;

public class Test {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.increment();
        c2.increment();
        c1.increment();
        c2.increment();
        c1.increment();
        c1.increment();
        c1.increment();
        c2.increment();

        c1.displayCount();
        c2.displayCount();
    }
}
