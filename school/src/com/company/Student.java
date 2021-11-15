package com.company;

public class Student {
    String name;
    int age;
    int grade;
    public Student( String n,int a,int g){
        this.name=n;
        this.age=a;
        this.grade=g;

    }


    public String toString() {
        return "Student"+
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade
                ;
    }

}


