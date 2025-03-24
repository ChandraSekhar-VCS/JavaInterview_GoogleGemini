package Assignment_18;

public class Person {
    String name;

    void sendToProcessor(Processor processor) {
        processor.process(this);
    }
}
