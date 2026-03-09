package org.beans.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = (Car) context.getBean("carBean");

        car.drive();

        Student s= (Student) context.getBean("stdId");
        s.display();
    }
}
