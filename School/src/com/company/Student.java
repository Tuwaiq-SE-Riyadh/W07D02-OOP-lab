package com.company;

public class Student {
    private String name;
    private int age;
    private int id;
    private char grade;
    private String favSubject;

    public Student(String name, int age, int id, char grade, String favSubject){
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.favSubject = favSubject;
    }

    public String toString(){
        String output = "Name: "+name+"\n";
        output += "Age: "+age+" years\n";
        output += "ID: "+id+"\n";
        output += "Grade: "+grade+"\n";
        output += "Favorite subject: "+favSubject+"\n";
        return output;
    }
}
