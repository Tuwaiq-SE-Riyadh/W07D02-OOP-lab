package com.company;

public class Main {

    public static void main(String[] args) {
     Teacher Teacher1 =new Teacher("noure",30, "12345678");
     Teacher Teacher2 =new Teacher("Amal",44, "876543211");
     Teacher Teacher3 =new Teacher("Huda",35, "12348765");

        System.out.println("The teachers :");
        System.out.println(Teacher1.toString());
        System.out.println(Teacher2.toString());
        System.out.println(Teacher3.toString());


        Student student1 =new Student("Mariam",19, 70);
        Student student2 =new Student("Wejdan",22, 100);
        Student student3 =new Student("bayan",20, 90);


        System.out.println("The students :");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());






    }
}

