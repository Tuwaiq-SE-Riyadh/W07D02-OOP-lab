package com.company;

public class Teacher {
    //Attributes
    String name;
    int age;
    String subject;
    //constructor
    public Teacher(String name,int age,String subject){
        this.name=name;
        this.age=age;
        this.subject=subject;
    }
//tostring methods
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSubject(){
        return subject;
    }
}
