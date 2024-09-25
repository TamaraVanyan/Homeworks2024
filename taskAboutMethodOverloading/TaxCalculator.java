package taskAboutMethodOverloading;
/*Calculate Income Tax Based on Salary Using Overloaded Functions (With Special IT Tax Rate)
Write overloaded methods named calculateIncomeTax:
One version accepts a gross salary (as a double) and calculates the income tax based on a default tax rate of 20%.
Another version accepts a gross salary and a custom tax rate (as a double) to calculate the income tax.
A third version accepts a gross salary and a flag indicating whether the person works in the IT sector,
applying a special tax rate of 10% for IT employees.*/
public class TaxCalculator {
    public static void main(String[] args) {
        double salary = 100000;

        System.out.println("Income tax with default rate: " + calculateIncomeTax(salary));

        System.out.println("Income tax with custom rate: " + calculateIncomeTax(salary, 28));

        System.out.println("Income tax for IT sector employee: " + calculateIncomeTax(salary, true));

        System.out.println("Income tax for non-IT sector employee: " + calculateIncomeTax(salary, false));
    }

    public static double calculateIncomeTax(double grossSalary) {
        return grossSalary * 20 / 100;
    }

    public static double calculateIncomeTax(double grossSalary, double customTaxRate) {
        return grossSalary * customTaxRate / 100;
    }

    public static double calculateIncomeTax(double grossSalary, boolean isIT) {
        double taxRate;

        if (isIT) {
            taxRate = 10.0;
        } else {
            taxRate = 20.0;
        }

        return grossSalary * taxRate / 100;
    }
}