              package com.company;

              import com.company.Student;
              import com.company.Teacher;

              public class Main {

                  public static void main(String[] args) {
                      Student Nasser = new Student("Nasser",25,90);
                      System.out.println(Nasser.toString());
                      System.out.println("------------------------------------------------------------");
                      Teacher Ahmed = new Teacher("Ahmed",27,"JAVA");
                      System.out.println(Ahmed.toString());
                  }
              }
