package com.company;

public class Teacher {
    String name;
    int age;
    int id;
    public Teacher(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id= id;
    }

    public String toString() {
        return "The name if teacehr is: " + name + "\n The age of teacehr: " + age;
    }
}
