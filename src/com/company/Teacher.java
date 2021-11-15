package com.company;

public class Teacher {
    String name;
    int age ;
    String subject;

    public Teacher(String name,int age,String subject){
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public String toString(){
        String output = "My name is "+ name;
        output += ", my age is "+ age;
        output += " and i am "+subject+" Teacher";
        return output;
    }
}
