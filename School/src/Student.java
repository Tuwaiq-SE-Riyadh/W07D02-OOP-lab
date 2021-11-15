public class Student {
    String name;
    int id;
    int age;
    char grade;
    String registrationClass;

    public Student(String name, int id, int age, char grade, String registrationClass) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.registrationClass = registrationClass;
    }

    public String toString() {
        String output = "Name: " + name;
        output += "\nID:" + id;
        output += "\nAge:" + age;
        output += "\nGrade:" + grade;
        output += "\nRegistration class:" + registrationClass;
        return output;
    }
}
