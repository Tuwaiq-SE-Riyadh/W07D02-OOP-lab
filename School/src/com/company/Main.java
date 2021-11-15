package com.company;

public class Main {

    public static void main(String[] args) {
    Teacher teacher=new Teacher("teacher1",26,"Java");
    Student student= new Student("Student1",6, teacher.name);
        //display teacher values
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getSubject());
        //display student value
        System.out.println(student.getName());
        System.out.println(student.getSubject());
        System.out.println(student.getTeacher());
    }

}
