package com.company;

public class Student {
    String name;
    int age;
    double grade;
    public Student(String name,int age,double grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }


    public String toString(){
        String output="";
        output+="\n name : "+name;
        output+="\n age : "+age;
        output+="\n grade : "+grade;
        return output;
    }
}
