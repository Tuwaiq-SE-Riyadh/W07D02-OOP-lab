package com.company;


public class Main {

    public static void main(String[] args) {


        Teacher firstTeacher = new Teacher("Muhammed",63,1);
        Teacher secondTeacher = new Teacher("Ahmad",50,2);
        Teacher thirdTeacher = new Teacher("Faisal",40,3);

        Student firstStudent = new Student("Abdulaziz",18,01);
        Student secondStudent = new Student("Fahad",17,02);
        Student thirdStudent = new Student("Suliman",18,03);

        System.out.println(firstTeacher.toString());
        System.out.println(secondTeacher.toString());
        System.out.println(thirdTeacher.toString());
        System.out.println(firstStudent.toString());
        System.out.println(secondStudent.toString());
        System.out.println(thirdStudent.toString());

    }



}
