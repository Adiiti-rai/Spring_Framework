package dependencyinjectionpackage;
// constructor- based dependency injection
public class Pen {
    void write(){
        System.out.println("used for writing the letter");
    }
}
class Student{
    Pen pen;
    Student(Pen pen){
        this.pen= pen;
    }
    void writing(){
        pen.write();
        System.out.println("Student is writing the letter");
    }
    public static void main(String[] args){
        Student student= new Student(new Pen());
//        Pen pen= new Pen();
//        Student student= new Student(pen);
        student.writing();
    }
}
