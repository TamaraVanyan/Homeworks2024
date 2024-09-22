package tasksAboytArraysAndLoops;
/*Վերցնում եք ամբողջ թվերի զանգված։ Մի ցիկլով գտնում եք տվյալ
 զանգվածի միջի մինիմում ու մաքսիմում թվերը։ Դիտարկում եք տարբեր corner case-եր նաև,
 որպեսզի վստահ լինեք, որ ճիշտա աշխատում։ Օրինակ եթե array-ի մեջ բոլոր թվերը նույնն են,
 ուրեմն ձեր մինիմումն ու մաքսիմումը պիտի համընկնեն։*/
public class MinMaxOfArr {
    public static void main(String[] args) {
        int[] array = {15, 25, 35, 45, 1, 2, 3};
        //int[] array = {-15, 25, -35, 45, 1, 2, 325, 0};
        //int[] array = {15, 15, 15, 15, 15};

        if (array.length == 0) {
            System.out.println("Array is emptyt");
            System.exit(2);
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        if (min == max) {
            System.out.println("Minimum and maximum numbers in array the same: " + min);
        } else {
            System.out.println("Minimum number from array is: " + min);
            System.out.println("Maximum number from array is: " + max);
        }
    }
}
