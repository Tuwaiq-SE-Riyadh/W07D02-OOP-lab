package com.company;

public class Teacher {
    private String name;
    private int age;
    private int id;
    private String subject;
    private int salary;

    public Teacher(String name, int age,  int id, String subject, int salary){
        this.name = name;
        this.age = age;
        this.id = id;
        this.subject = subject;
        this.salary = salary;
    }
    public String toString(){
        String output = "Name: "+name+"\n";
        output += "Age: "+age+" years\n";
        output += "ID: "+id+"\n";
        output += "Subject: "+subject+"\n";
        output += "Salary: "+salary+"\n";
        return output;
    }
}
