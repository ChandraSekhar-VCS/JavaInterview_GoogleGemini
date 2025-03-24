package Assignment_27;

public class Car {
    Engine engine;
    Car(Engine engine){
        this.engine = engine;
    }
    void startCar(){
        engine.start();
    }
}
