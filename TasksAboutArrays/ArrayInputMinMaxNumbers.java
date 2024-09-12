package TasksAboutArrays;
import java.util.Scanner;
public class ArrayInputMinMaxNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n < 1 || n >8) {
            System.out.println("Array length should be from 2 to 8!");
            System.exit(2);
        }
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int[] array = new int[n];

            int middleIndex = n / 2;
            if (a < b) {
                array[middleIndex - 1] = a;
                array[middleIndex] = b;
            } else {
                array[middleIndex - 1] = b;
                array[middleIndex] = a;
            }
        System.out.println("Left of middle: " + array[middleIndex - 1]);
        System.out.println("Right of middle: " + array[middleIndex]);
    }
}
