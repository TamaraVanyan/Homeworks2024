package teacher;

public class Test {
    public static void main(String[] args) {
        Teacher.setMinSalaryAndK(100000, 1.8);

        Teacher teacher1 = new Teacher("Perosyan", 1.2);
        Teacher teacher2 = new Teacher("Hakobyan", 0.8);
        Teacher teacher3 = new Teacher("Abrahamyan", 5.0);

        System.out.println(teacher1.getName() + " salary is " + teacher1.getSalary());
        System.out.println(teacher2.getName() + "  salary is " + teacher2.getSalary());
        System.out.println(teacher3.getName() + " salary is " + teacher3.getSalary());

        Teacher.setMinSalaryAndK(50000, 1.5);
        Teacher teacher4 = new Teacher("Galstyan", 1.3);
        System.out.println(teacher4.getName() + " salary is " + teacher4.getSalary());

        Teacher.setMinSalaryAndK(90000, 0);
        Teacher teacher5 = new Teacher("Poghosyan", 0.3);

        System.out.println(teacher5.getName() + " salary is " + teacher5.getSalary());
    }
}
