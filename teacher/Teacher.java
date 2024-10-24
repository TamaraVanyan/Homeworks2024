package teacher;

public class Teacher {
    private static double MIN_SALARY;
    private static double K;
    private static double minBaseSalary;
    private String name;
    private double W;
    private double salary;

    static {
        MIN_SALARY = 68000;
        K = 1;
        minBaseSalary = K * MIN_SALARY;
    }

    public Teacher(String name, double W) {
        this.name = name;
        this.salary = W * minBaseSalary;
    }

    public static void setMinSalaryAndK(double minSalary, double k) {
        if (minSalary < 68000) {
            System.out.println("Min salary should be up to 68000. Setting to default.");
            minSalary = 68000;
        }
        if (k < 1) {
            System.out.println("K should be more than 1. Setting K to 1.");
            k = 1;
        }
        MIN_SALARY = minSalary;
        K = k;
        minBaseSalary = K * MIN_SALARY;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    private void setW(double W) {
        if (W < 1) {
            System.out.println("W should be more than 1. Setting W to 1.");
            W = 1;
        }
        this.W = W;
    }
}