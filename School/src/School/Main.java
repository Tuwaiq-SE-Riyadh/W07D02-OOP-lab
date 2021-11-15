package School;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Create project called School it has the main method
//        Create two classes named Teacher and Student. Each class should contain:
//
//        At least three attributes
//        A constructor
//        A toString method to display the values of all the attributes of each class
//        Edit Main.java to check the toString methods you’ve created for each of the classes above.
//           To test the toString methods, create three instances of each class (each with different attribute values)
//           and display them as was done for the Student class.

        Student student1 = new Student("Shrooq",123456789,4.8,3);
        Teacher teacher1 = new Teacher("Besslan",237454835,6);
        System.out.println(student1.toString());
        System.out.println(teacher1.toString());
    }
}
