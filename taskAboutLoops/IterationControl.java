package RaskAboutLoops;

import java.util.Scanner;

/*Ունեք double[] array. մեջը խառը դրական ու բացասական թվեր։ Ձեր խնդիրը հետևյալումա`
սկսում եք իտերացիան առաջին էլեմենտից ու
եթե հերթական էլեմենտը դրական թիվա, իտերացիան մի քայլով եք առաջ տանում
եթե կանգնում եք բացասական թվի վրա, ուրեմն իտերացիան 2 քայլով եք առաջ տանում
Եթե կանգնում եք 0-ի վրա, պետքա տեղում դուրս գաք ցիկլից
Վերջում պետքա տպեք բոլոր էն թվերի գումարը, որոնց վրայով անցել եք իտերացիաների ընթացքում։*/
public class IterationControl {
    public static void main(String[] args) {
        double[] array = {1.5, -1.5, -3.14, -1.5, 6.456, 11.5, 0, -0.678};

        double sum = 0;
        int i = 0;
        while (i < array.length) {
            double current = array[i];

            if (current > 0) {
                sum += current;
                i++;
            } else if (current < 0) {
                sum += current;
                i += 2;
            } else if (current == 0) {
                break;
            }
        }

        System.out.println("Sum of elements iterated over: " + sum);
    }
}
