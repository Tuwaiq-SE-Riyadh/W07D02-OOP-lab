package com.company;

public class Teacher {
    String name;
    String subject;
    int age;

    public Teacher (String name, String subject,int age){

        this. name=name;
        this. subject=subject;
        this.age=age;

    }


    public String toString() {
        return "Teacher" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", age=" + age
                ;
    }
}

