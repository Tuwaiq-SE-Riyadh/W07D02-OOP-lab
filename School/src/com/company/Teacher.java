package com.company;

public class Teacher {
    String name;
    String course;
    int age;

    public Teacher (String name, String course,int age){

        this. name=name;
        this. course=course;
        this.age=age;

    }


    public String toString() {
        return "Teacher\t" +
                "name =\t" + name +"\t"+
                "Course =\t" + course + "\t" +
                "age =\t" + age
                ;
    }
}
