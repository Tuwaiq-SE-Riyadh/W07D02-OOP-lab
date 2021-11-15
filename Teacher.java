package com.company;

public class Teacher {
    String name;
    int id;
    int age;

    public  Teacher(String n,int i,int a){
            name= n;
            id=i;
            age=a;
    }
    public void toSrting(){
        System.out.println("name= "+name+" id= "+id+" age= "+age);

    }
}
