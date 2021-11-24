package oop;

public class Main {

    public static void main(String[] args) {
        //Student1
Student student1=new Student("Sarah",24,"sarah@gmail.com","436200154","Java");
        System.out.println("\nStudent1:\n"+ student1.toString());
        //Student2
        Student student2=new Student("Khlood",26,"Khlood@gmail.com","436200154","Java Script");
        System.out.println("\nStudent2:\n"+ student2.toString());
        //Student3
        Student student3=new Student("Reem",24,"Reem@gmail.com","436200154","Python");
        System.out.println("\nStudent3:\n"+ student3.toString());
//Teacher1
Teacher teacher1=new Teacher("Maha",34,"Maha@gmail.com","123","Python");
        System.out.println("\nTeacher1:\n"+ teacher1.toString());
        //Teacher1
        Teacher teacher2=new Teacher("Maryam",27,"Maryam@gmail.com","342","JAVA");
        System.out.println("\nTeacher2:\n"+ teacher2.toString());
        //Teacher1
        Teacher teacher3=new Teacher("Amal",27,"Amal@gmail.com","213","Java Script");
        System.out.println("\nTeacher3:\n"+ teacher3.toString());

    }
}
