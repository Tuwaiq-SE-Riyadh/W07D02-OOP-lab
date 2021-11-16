package com.company;

public class Student {

    String name;
    String email;
    int age;

    public  Student (String name,String email,int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }


    public String toString() {
        return "Student " +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age ;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getAge(){
        return age;
    }

}
