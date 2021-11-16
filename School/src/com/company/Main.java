package com.company;

public class Main {

    public static void main(String[] args) {
        Student s1 =new Student("Terf",18,20);
        Student s2 =new Student(" Wed",17,20);
        Teacher teacher1=new Teacher("Reem","Sciences",36);
        Teacher teacher2=new Teacher("Afnan","Math",28);

        System.out.println(s1.toString()+"\n");
        System.out.println(s2.toString()+"\n");
        System.out.println(teacher1.toString()+"\n");
        System.out.println(teacher2.toString()+"\n") ;   }
}
