package oopLab;

public class Teacher {
	String firstName = "";
	String lastName = "";
	String nationality = "";
	int age = 0;
	double salary = 0.0;
	
	public Teacher(String firstName, String lastName, String nationality, int age, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationality = nationality;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "First Name: " + firstName + "\nLast Name: " + lastName + "\nNationality: " + nationality + "\nage: " + age + "\nSalary: " + salary;
	}
	
}
