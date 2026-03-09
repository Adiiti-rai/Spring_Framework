package dependencyinjectionpackage;
// constructor injection
public class Engine {
    void start(){
        System.out.println("start the engine");
    }
}
class Car{
    Engine engine;// this line does not create any object. engine is dependency of car
    // it means car depends on engine
    Car(Engine engine){ // This line does NOT create an object.
        // Purpose here:
        //To receive Engine dependency from outside.
        this.engine= engine;
    }
    void drive(){
        engine.start();
        System.out.println("drive the car");
    }
    public static void main(String[] args){
        //Car car= new Car(new Engine());
        Engine e= new Engine();
        Car car= new Car(e);
        car.drive();
    }
}
