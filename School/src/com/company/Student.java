package com.company;

public class Student {
    //Attributes
    String name;
    int subjectTake;
    String teacher;
    //Constructor
    public Student(String name,int subjectTake,String teacher){
        this.name=name;
        this.subjectTake=subjectTake;
        this.teacher=teacher;
    }
    //ToString methods
    public String getName(){
        return name;
    }
    public  int getSubject(){
        return subjectTake;
    }
    public String getTeacher(){
        return teacher;
    }
}
