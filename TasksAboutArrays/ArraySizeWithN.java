package TasksAboutArrays;
import java.util.Scanner;
public class ArraySizeWithN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if(n <= 0){
            System.out.println("n should be natural number.");
            System.exit(2);
        }

        int[] array;
        switch (n) {
            case 3:
            case 4:
            case 5:
                array = new int[n];
                break;
            case 6:
            case 7:
                array = new int[10];
                break;
            default:
                array = new int[15];
                array[0] = 15;
                System.out.println("Array firs element is: " + array[0]);
                break;
        }
        System.out.println("Array size: " + array.length);
    }
}