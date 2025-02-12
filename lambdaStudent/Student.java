package lambdaStudent;

import java.util.List;
import java.util.function.Consumer;

public class Student {
    String name;
    int age;
    double grade;
    String birthYear;

    public Student(String name, int age, double grade, String birthYear) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.birthYear = birthYear;
    }

    public static void processStudents(List<Student> students, Consumer<Student> action) {
        for (Student student : students) {
            action.accept(student);
        }
    }
    @Override
    public String toString() {
        return "name=" + name + ", age=" + age + ", grade=" + grade + ", birthYear=" + birthYear + " ";
    }
}