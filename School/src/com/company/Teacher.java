package com.company;


    public class Teacher  {
        String FirstName ;
        String LastName;
        int Age;
        public Teacher (String Fname , String Lname, int Age) {
            this.FirstName=Fname;
            this.LastName=Lname;
            this.Age=Age;
           }



            public String toString(){
            return " First name : "+FirstName+" ,Last Name : "+LastName +" ,Age: "+Age;
        }
}
