package generics;
import java.util.ArrayList;
import java.util.Collections;

public class ListOfStudent {
    public static void main(String[] args) {
        ArrayList<StudentGrades> students = new ArrayList<>();

        students.add(new StudentGrades("Vazgen", 85, 90, 60));
        students.add(new StudentGrades("Gago", 95, 75, 80));
        students.add(new StudentGrades("Ani", 90, 88, 98));
        students.add(new StudentGrades("Anna", 40, 70, 95));
        students.add(new StudentGrades("Karen", 100, 98, 93));

        Collections.sort(students);

        System.out.println("Students sorted by total knowledge: ");
        for (StudentGrades student : students) {
            System.out.println(student);
        }
    }
}