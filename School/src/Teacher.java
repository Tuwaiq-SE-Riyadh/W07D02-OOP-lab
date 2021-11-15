public class Teacher {
    int id;
    String name;
    int age;
    int salary;
    String registrationClass;

    public Teacher(String name, int id, int age, int salary, String registrationClass) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.registrationClass = registrationClass;
    }

    public String toString() {
        String output = "Name: " + name;
        output += "\nID:" + id;
        output += "\nAge:" + age;
        output += "\nSalary:" + salary;
        output += "\nRegistration class:" + registrationClass;
        return output;
    }
}
