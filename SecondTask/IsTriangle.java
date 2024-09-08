package SecondTask;
import java.util.Scanner;

public class IsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the first side of the triangle:");
        int a = scanner.nextInt();
        System.out.println("Enter the length of the second side of the triangle:");
        int b = scanner.nextInt();
        System.out.println("Enter the length of the third side of the triangle:");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("It is possible to construct a triangle with the sides: " + a + ", " + b + ", " + c);
        } else {
            System.out.println("It is not possible to construct a triangle with the sides: " + a + ", " + b + ", " + c);
        }
        scanner.close();
    }
}