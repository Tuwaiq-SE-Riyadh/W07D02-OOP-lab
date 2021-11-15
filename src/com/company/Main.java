package com.company;

public class Main {

    public static void main(String[] args) {

        Student student=new Student("norah",25,"sudai" );
        TeacherImpl teacher=new TeacherImpl("reama",24,"sudi");
        System.out.println(student.toString1());
        System.out.println(teacher.toString1());

    }



}
