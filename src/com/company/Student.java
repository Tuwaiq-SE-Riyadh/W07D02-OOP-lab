package com.company;

public class Student {

    String name;
    int age;
    String nationality;
public  Student(String name,int age,String nationality){
    this.name=name;
    this.age=age;
    this.nationality=nationality;
}
public String toString1(){
   String output= "name:" +name;
    output+="\n age:" +age;
    output+="\n nationality:" +nationality;
    return output;
}
public String getName(){

    return name;
}
    public String getNationality(){

        return nationality;
    }
    public int getAge(){

        return age;
    }
}
