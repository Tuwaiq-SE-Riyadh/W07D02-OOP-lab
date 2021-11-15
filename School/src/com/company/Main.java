package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student student = new Student("Abdulla",15,10355945);
        Teacher teacher = new Teacher("Ali",36,1156987);

//        System.out.println(student);
//        System.out.println(teacher);

        student.print();
        teacher.print();


    }
}

