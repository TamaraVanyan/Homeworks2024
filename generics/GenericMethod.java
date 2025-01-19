package generics;
import java.util.ArrayList;

public class GenericMethod {

    public static <T> boolean containsElement(ArrayList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        StudentGrades student1 = new StudentGrades("Vzgen", 90, 85, 80);
        StudentGrades student2 = new StudentGrades("Gago", 95, 90, 85);
        StudentGrades student3 = new StudentGrades("Ani", 80, 75, 70);
        StudentGrades student4 = new StudentGrades("Pabam", 15, 8, 75);

        ArrayList<StudentGrades> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        boolean containsStudent1 = containsElement(students, student1);
        System.out.println("Does the list contain student1? " + containsStudent1);

        boolean containsStudent4 = containsElement(students, student4);
        System.out.println("Does the list contain student4? " + containsStudent4);
    }
}