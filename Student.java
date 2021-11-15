package com.company;

public class Student {
    String name;
    int id;
    int age;
    String course;

    public  Student(String n,int i,int a,String c){
        name= n;
        id=i;
        age=a;
        course=c;
    }
    public void toSrting(){
        System.out.println("name= "+name+" id= "+id+" age= "+age + " course= "+course);

    }
}
