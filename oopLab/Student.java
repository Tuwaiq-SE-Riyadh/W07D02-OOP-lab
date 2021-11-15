package oopLab;

public class Student {
	String firstName = "";
	String lastName = "";
	String gender = "";
	String major = "";
	int age = 0;
	
	public Student(String firstName, String lastName, String gender, String major, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.major = major;
		this.age = age;
	}

	@Override
	public String toString() {
		return "First Name: " + firstName + "\nLast Name: " + lastName + "\ngender: " + gender + "\nStudent major: " + major + "\nage: " + age;
	}
}
