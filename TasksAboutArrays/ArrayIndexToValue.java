package TasksAboutArrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayIndexToValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = scanner.nextInt();

        System.out.print("Enter the index a: ");
        int a = scanner.nextInt();

        if (a < 0 || a + 2 >= n) {
            System.out.println("Index should be positive number and number not more than n-3 for not out of bounds.");
            System.exit(2);
        }

        int[] array = new int[n];

        array[a] = a;
        array[a + 1] = a + 1;
        array[a + 2] = a + 2;

        System.out.println(Arrays.toString(array));
    }
}