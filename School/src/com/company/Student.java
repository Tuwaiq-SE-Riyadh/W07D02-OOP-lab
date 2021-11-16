package com.company;

public class Student {
    String name;
    int age;
    int grade;
    public Student( String name,int age,int grade){
        this.name=name;
        this.age=age;
        this.grade=grade;

    }


    public String toString() {
        return "Student\t"+
                "name =\t" + name + '\t' +
                "age =\t" + age + '\t' +
                "grade =\t" + grade ;
    }

}

