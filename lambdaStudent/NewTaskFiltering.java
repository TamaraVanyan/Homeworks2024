package lambdaStudent;

import java.util.*;
import java.util.stream.Collectors;

public class NewTaskFiltering {
    public static void main(String[] args) {
        List<Student> students = GeneratingStudent.generateStudents(); // 20 ուսանողի գեներացիա
/*Գտնել և տպել այն ուսանողների անունները, ովքեր համապատասխանում են հետևյալ չափանիշներին՝
Նրանց տարիքը 18-ից 22-ի սահմաններում է։
Նրանց գնահատականը 60-ից 80-ի սահմաններում է։*/
        System.out.println("Students age between 18 and 22 with grades between 60-80: ");
        students.stream()
                .filter(s -> s.age >= 18 && s.age <= 22 && s.grade >= 60 && s.grade <= 80)
                .map(s -> s.name)
                .forEach(name -> System.out.print(name + ", "));
        System.out.println("\n___________________________________");

/*Ստեղծել ուսանողների ցուցակ, որոնց գնահատականները բարձրացված են 15%-ով, բայց համոզվել, որ ոչ մի գնահատական չի գերազանցում 80-ը։*/
        List<Student> updatedStudents = students.stream()
                .map(s -> new Student(s.name, s.age, Math.min(80, s.grade += (s.grade * 15) / 100), s.birthYear))
                .collect(Collectors.toList());
        System.out.println("\nStudents with grades increased by 15%: ");
        updatedStudents.forEach(s -> System.out.println(s.name + ": " + s.grade));
        System.out.println("\n___________________________________");

/*Ուսանողներին խմբավորել ծննդյան տարվա հիման վրա և տպել յուրաքանչյուր տարում ուսանողների քանակը։*/
        System.out.println("\nStudents grouped by birth year:");
        Map<String, Long> studentsByBirthYear = students.stream()
                .collect(Collectors.groupingBy(s -> s.birthYear, Collectors.counting()));
        studentsByBirthYear.forEach((year, count) -> System.out.println(year + ": " + count));

        System.out.println("\n___________________________________");

/*Գտնել և հաշվարկել 20 և բարձր տարիք ունեցող ուսանողների միջին գնահատականը։ Արդյունքը մշակել Optional-ով։*/
        OptionalDouble avgGrade = students.stream()
                .filter(s -> s.age >= 20)
                .mapToDouble(s -> s.grade)
                .average();

        System.out.println("\nAverage grade of students age 20 and above:");
        avgGrade.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("No students found in this age group.")
        );

        //Ստուգել՝ արդյո՞ք բոլոր ուսանողների գնահատականները 45-ից բարձր են, և տպել արդյունքը։
        boolean allAbove45 = students.stream().allMatch(s -> s.grade > 45);
        System.out.println("\nAre all students' grades above 45? " + allAbove45);

        //Գտնել ամենացածր գնահատական ունեցող ուսանողին և տպել
        students.stream()
                .min(Comparator.comparingDouble(s -> s.grade))
                .ifPresent(s -> System.out.println("\nStudent with the lowest grade:\n" + s));

        //Ստեղծել անունների ստորակետերով բաժանված տող, դասավորված այբբենական կարգով
        String sortedNames = students.stream()
                .map(s -> s.name)
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println("\nAlphabetically sorted student names:\n" + sortedNames);

        //Ուսանողների գնահատականների խմբավորում
        System.out.println("\nStudents grouped by grades:");
        Map<String, List<Student>> gradeGroups = students.stream()
                .collect(Collectors.groupingBy(s -> {
                    if (s.grade < 60) return "grades < 60";
                    else if (s.grade <= 70) return "60 - 70";
                    else return "> 70";
                }));

        gradeGroups.forEach((range, group) -> {
            System.out.println(range + ": " + group.size() + " students");
            group.forEach(System.out::println);
        });

        //Գտնել ամենաերիտասարդ ուսանողին
        students.stream()
                .min(Comparator.comparingInt(s -> s.age))
                .ifPresent(s -> System.out.println("\nYoungest student:\n" + s));
    }
}