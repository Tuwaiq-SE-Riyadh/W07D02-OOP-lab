package com.company;

public class Student
{
    String name ;
    int age;
    String gender ;

    // This constructor [ n == name , a == age , g == gender ]
    public Student(String n, int a, String g )
    {
        name = n;
        age = a;
        gender = g;
    }

    public String toString()
    {
        return " Student [ name: "+name+" age: "+age+" Gender: "+gender+"]";
    }
}
