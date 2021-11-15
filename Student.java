package com.company;

public class Student {
    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public String phone;

    public Student(int id, String firstName, String lastName, int age, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
