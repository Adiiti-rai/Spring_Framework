package dependencypackage;

import java.util.*;

public class Engine {
    void start(){
        System.out.println("start the engine");
    }
}
class Car{
    Engine engine= new Engine();// Creating dependency inside the car.

    // car depends on engine it means car creates its own engine object.
    void drive() {
        engine.start();
        System.out.println("drive the car");
    }
    public static void main(String[] args){
            Car car= new Car();
    car.drive();
}
}
