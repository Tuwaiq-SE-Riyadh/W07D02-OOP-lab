package School;

public class Student {
    String name;
    int id;
    double gpa;
    int numberOfClasses;
    public Student(String name, int id, double gpa, int numberOfClasses) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.numberOfClasses = numberOfClasses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                ", numberOfClasses=" + numberOfClasses +
                '}';
    }
}
