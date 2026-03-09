package dependencypackage;

public class Pen {
    void write(){
        System.out.println("writes the letter");
    }
}
class Student{
    Pen pen= new Pen();
    void writing(){
        pen.write();
        System.out.println("student writes the letter");
    }
    public static void main(String[] args){
        Student s= new Student();
        s.writing();
    }
}
