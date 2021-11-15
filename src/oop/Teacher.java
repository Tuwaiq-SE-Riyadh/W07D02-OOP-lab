package oop;

public class Teacher {

        public String name="";
        public int age=0;
        public String email="";
        public String id="";
        public String  course="";

        public Teacher(String name,int age,String email,String id,String  course){
            this.name=name;
            this.age=age;
            this.email=email;
            this.id=id;
            this.course=course;
        }
    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nEmail: "+email+"\nID: "+id+"\nCourse: "+course;
    }


    }


