package org.config;

public class Student {
    private String name;
    private String email;
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
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Id: "+id);
    }
}
