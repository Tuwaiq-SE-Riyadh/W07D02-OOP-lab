package com.company;

public class Main {

    public static void main(String[] args)
    {

        // Teacher objects
        Teacher teacherObject1 = new Teacher("Saad",24,"0500000001");
        Teacher teacherObject2 = new Teacher("fahad",20,"0500658437");
        Teacher teacherObject3 = new Teacher("ahmad",22,"0534i49301");
        System.out.println(teacherObject1);
        System.out.println(teacherObject2);
        System.out.println(teacherObject3);

        // ----------------------
        System.out.println("-----------");
        // ----------------------

        // Student objects
        Student studentObject1 = new Student("Abdurahman" , 19 , "Male");
        Student studentObject2 = new Student("sara" , 20 , "Female");
        Student studentObject3 = new Student("Nora" , 19 , "Female");
        System.out.println(studentObject1);
        System.out.println(studentObject2);
        System.out.println(studentObject3);


    }
}
