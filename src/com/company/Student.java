package com.company;

public class Student {
    String name;
    int age;
    int grade;
    public Student(String name,int age,int grade){
        this.name = name;
        this.age= age;
        this.grade = grade;
    }

    public String toString(){
        String output = "Name: " + name;
        output += "\nAge: "+age;
        output += "\nGrade: "+grade;
        return output;
    }
}
