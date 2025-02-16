package lambdaStudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lambdaStudent.Student.processStudents;
/*Ստեղծել դաս Student, որն ունի հետևյալ դաշտերը՝ String name, int age, double grade, String birthYear (որպես String)
Ստեղծել մի քանի Student օբյեկտներ և ավելացնել դրանք լիստի մեջ: Ստեղծել մեթոդ processStudents, որը ստանում է ուսանողների
ցուցակը և Consumer<Student>, այնուհետև կանչում է տվյալ Consumer-ի accept() մեթոդը ցուցակի յուրաքանչյուր էլեմենտի համար:
Լամբդա արտահայտություններով իրականացնել հետևյալ գործողությունները՝ Տպել ուսանողների տվյալները։
-Բարձրացնել բոլոր ուսանողների գնահատականները 10%-ով։
-Տպել միայն այն ուսանողների անունները, որոնց գնահատականը մեծ է 90-ից։
Նույն գործողությունները անել method reference-ով, որտեղ հնարավոր է։*/
public class StudentImplementation {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Gago", 18, 85.5, "2006"),
                new Student("Vazgen", 19, 75, "2006"),
                new Student("Anna", 18, 78.0, "2006"),
                new Student("Any", 19, 98, "2005")
        ));

        System.out.println("All students: ");
        students.forEach(student -> System.out.println(student));

        System.out.println("_________________________________\n All students with 10% increased grades: ");
        students.forEach(student -> {
            student.grade = Math.min(100, student.grade += student.grade * 0.1);
            System.out.println(student);
        });

        System.out.println("_________________________________________________________");
        System.out.print("Students with grade more than 90: ");
        processStudents(students, student -> {
            if (student.grade > 90) {
                System.out.print(student.name + ", ");
            }
        });

        System.out.println("\n________________________________");
        System.out.println("All students printed with method Reference: ");
        processStudents(students, System.out::println);
    }
}