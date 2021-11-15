package com.company;

public class Student {
    String name;
    int age;
    int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String toString() {
        return "The name if student is: " + name + "\n The age of student: " + age;
    }

}
