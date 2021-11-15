package com.company;

public class Student {

        String Name ;
        int length;
        int Age;
        public Student (String Fname ,int length , int Age) {
            this.Name=Fname;
            this.length=length;
            this.Age=Age;
        }
    public String toString(){
        return " name : "+Name+" ,length: "+length +" ,Age: "+Age;
    }
}


