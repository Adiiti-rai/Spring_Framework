package dependencypackage;

public class Keyboard {
    void type(){
        System.out.println("typing the keyboard");
    }
}
class Computer{
    Keyboard keyboard= new Keyboard();
    void work(){
        keyboard.type();
        System.out.println("complete the task");
    }
    public static void main(String[] args){
        Computer computer= new Computer();
        computer.work();
    }
}
