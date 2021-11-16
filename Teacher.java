package com.company;

public class Teacher {

     String name;
     String email;
     int age;

public  Teacher (String name,String email,int age){
     this.name = name;
     this.email = email;
     this.age = age;
}

     public String toString() {

     String output = "Teacher " +
                  "name='" + name + '\'' +
                  ", email='" + email + '\'' +
                  ", age=" + age ;
     return output;
     }

     public String getName(){
          return name;
     }

     public String getEmail(){
          return email;
     }

     public int getAge(){
          return age;
     }

}
