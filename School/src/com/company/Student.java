package com.company;

public class Student {

    private String name;
    private int age;
    private int id;


    public Student(String name, int age,int id){

        this.name = name;
        this.age = age;
        this.id = id;
    }

//    public String toString(){
//
//
//        return "Student \n name: " + name + "\n age: " + age + "\n id: S" + id + "\n";
//    }

    public void print(){

        System.out.println("Student \n name: " + name + "\n age: " + age + "\n id: S" + id + "\n");
    }
}
