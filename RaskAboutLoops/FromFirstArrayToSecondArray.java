package RaskAboutLoops;

import java.util.Scanner;

/* Ունեք ֆիքսված n չափանի ամբողջ թվերի զանգված։ n-ը որպես input ծրագիրը ստանումա
command line-ից, դրանից հետո պետքա ներմուծեք 2 թիվ` a ու b։ էս անգամ պետքա 2-րդ
զանգվածի մեջ գցեք առաջին զանգվածի a-րդ ինդեքսից b-րդ ինդեքս ընկած բոլոր էլեմենտները։
Պետքա 2-րդ զագնվածում վերագրումը սկսեք առաջին էլեմենտից սկսած (այսինքն 0-րդ) */
public class FromFirstArrayToSecondArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = scanner.nextInt();

        int[] array1 = new int[n];
        System.out.println("Type " + n + " integers for array:");
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.print("Enter index of array a: ");
        int a = scanner.nextInt();
        System.out.print("Enter index of array b: ");
        int b = scanner.nextInt();

        int[] array2 = new int[b - a + 1];
        for (int i = 0; i <= b - a; i++) {
            System.out.print(array1[a + i] + " ");
        }
    }
}
