package com.company;

public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher(0, "Tameem", "A", 18, "050005");
        Teacher t2 = new Teacher(1, "Ahmed", "B", 22, "0555555");
        Teacher t3 = new Teacher(2, "Omar", "C", 48, "057777");

        Student s1 = new Student(0, "A", "B", 13, "058888");
        Student s2 = new Student(1, "C", "D", 15, "054444");
        Student s3 = new Student(2, "E", "F", 25, "056666");

        System.out.println("-----------------------Teacher---------------------");
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println("-----------------------Student---------------------");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

    }
}
