package org.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context=  new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std=  (Student) context.getBean("stdId");
        std.display();
        //or
        //Student std= context.getBean(Student.class);
        // std.display();
    }
}
