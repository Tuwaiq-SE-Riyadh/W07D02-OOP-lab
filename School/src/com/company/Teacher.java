package com.company;

public class Teacher {

    private String name;
    private int age;
    private int id;

    public Teacher(String name, int age,int id){

        this.name = name;
        this.age = age;
        this.id = id;
    }

//    public String toString(){
//
//
//        return "Teacher \n name: " + name + "\n age: " + age + "\n id: " + id + "\n";
//    }

    public void print(){

        System.out.println("Student \n name: " + name + "\n age: " + age + "\n id: S" + id + "\n");
    }
}
