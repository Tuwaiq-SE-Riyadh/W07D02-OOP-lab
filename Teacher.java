package com.company;

public class Teacher {
    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public String phone;

    public Teacher(int id, String firstName, String lastName, int age, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
