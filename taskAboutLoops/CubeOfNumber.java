package RaskAboutLoops;
/*Ունեք ցանկացած ամբողջ թիվ, որը ներմուծում եք։ Ձեր խնդիրնա պարզել,
 թե արդյոք տվյալ թիվը հանդիսանումա մեկ այլ ամբողջ թվի խորանարդ։ Եթե հա, տպեք էդ թիվը,
 հակառակ դեպքում զուտ հաղորդագրություն տպեք, որ ձեր ներմուծածը չի հանդիսանում որևէ
 ամբողջ թվի խորանարդ.*/

import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int newNumber = 1;
        if (number < 0) {
            newNumber = -number;
        } else {
            newNumber = number;
        }

        int n1 = 0;
        while (n1 * n1 * n1 < newNumber) {
            n1++;
        }
        if (n1 * n1 * n1 == newNumber) {
            if (number < 0) {
                System.out.println(number + " is cube of " + (-n1));
            } else {
                System.out.println(number + " is cube of " + n1);
            }
        } else {
            System.out.println(number + " is not cube of some number");
        }
    }
}