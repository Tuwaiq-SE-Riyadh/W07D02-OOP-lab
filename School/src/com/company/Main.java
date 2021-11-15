package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher T1 = new Teacher("  Ghadeer" ,"Mansour" ,25);
        Teacher T2 = new Teacher("Mansour" ,"Hamdani",55 );
        Teacher T3 = new Teacher("sara" ,"Abdualrahman" ,48);
        Student S1 = new Student(" khaled" ,180 ,18);
        Student S2 = new Student("Mansour" ,160,19);
        Student S3 = new Student("Ahmad" ,173 ,20);


        System.out.println(T1.toString());
        System.out.println(T2.toString());
        System.out.println(T3.toString());
        System.out.println(S1.toString());
        System.out.println(S2.toString());
        System.out.println(S3.toString());
    }

}
