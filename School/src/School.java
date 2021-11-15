public class School {
    public static void main(String[] args){

//        for student
        Student Ali = new Student("Ali", 1, 21, 'D', "Java");
        Student Manal = new Student("Manal", 2 , 23, 'A', "Java");
        Student Ahmed = new Student("Ahmed", 3, 20, 'B', "Java");

        System.out.println(Ali.toString() + "\n");
        System.out.println(Manal.toString() + "\n");
        System.out.println(Ahmed.toString());

//        for teacher
        Teacher Khaled = new Teacher("Khaled", 1, 43, 14000, "Java");
        Teacher Maha = new Teacher("Maha", 2, 34, 11000, "Python");
        Teacher Ashjan = new Teacher("Ashjan", 3, 31, 11000, "JS");

        System.out.println(Khaled.toString() + "\n");
        System.out.println(Maha.toString() + "\n");
        System.out.println(Ashjan.toString());

    }
}
