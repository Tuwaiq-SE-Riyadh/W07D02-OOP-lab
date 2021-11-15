package School;

public class Teacher {
    String name;
    int id;
    int numberOfClasses;

    public Teacher(String name, int id, int numberOfClasses) {
        this.name = name;
        this.id = id;
        this.numberOfClasses = numberOfClasses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", numberOfClasses=" + numberOfClasses +
                '}';
    }
}
