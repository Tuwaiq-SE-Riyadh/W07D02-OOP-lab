package com.company;

public class Teacher {

    String name ;
    int age;
    String phone ;

    // This constructor [ n == name , a == age , p == phone ]
    public Teacher(String n, int a, String p )
    {
            name = n;
            age = a;
            phone = p;
    }

    public String toString()
    {
        return " Teacher [ name: "+name+" age: "+age+" phone: "+age+"]";
    }
}
