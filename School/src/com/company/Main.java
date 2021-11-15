package com.company;

public class Main {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("John", 30, 1, "Math", 7000);

        Student student = new Student("Mark", 20, 2, 'A', "Math");

        System.out.println(teacher.toString()+"\n");
        System.out.println(student.toString()+"\n");

    }
}
