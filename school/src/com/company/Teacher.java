package com.company;

public class Teacher {
  String name;
  int age;
  String id;
  public Teacher(String name,int age,String id){
    this.name=name;
    this.age=age;
    this.id=id;
  }


  public String toString(){
    String output="";
    output+="\n name : "+name;
    output+="\n age : "+age;
    output+="\n id : "+id;
    return output;
  }

}
