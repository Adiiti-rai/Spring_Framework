package org.usingAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("Ankit")
    private String name;
    @Value("aannkkiitt321@gmail.com")
    private String email;
    @Value("101")
    private int id;

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name= name;
    }
    public void setEmail(String email){
        this.email= email;
    }
    public void setId(int id){
        this.id= id;
    }
    public void display(){
        System.out.println("name:"+name);
        System.out.println("email:"+email);
        System.out.println("id:"+id);
    }
}
