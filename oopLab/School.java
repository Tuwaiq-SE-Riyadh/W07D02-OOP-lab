package oopLab;

public class School {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("Faisal", "Abdullah", "Saudi", 37, 19000);
		Student student = new Student("Ahmed", "Alsalem", "Male","Computer science", 19);
		
		System.out.println("---Teacher Data---");
		System.out.println(teacher.toString());
		System.out.println("\n---Student Data---");
		System.out.println(student.toString());

	}

}
