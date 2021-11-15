package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s1 =new Student("sally",20,15);
        Student s2 =new Student("sara",21,20);
        Teacher teacher1=new Teacher("nora","math",30);
        Teacher teacher2=new Teacher("maha","Art",25);

        System.out.println(s1.toString()+"\n");
        System.out.println(s2.toString()+"\n");
        System.out.println(teacher1.toString()+"\n");
        System.out.println(teacher2.toString()+"\n");


    }

}
