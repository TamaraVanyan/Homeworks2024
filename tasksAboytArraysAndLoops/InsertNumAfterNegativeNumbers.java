package tasksAboytArraysAndLoops;
/*Ունեք խառը թվերով լցված զանգված։ Զանգվածի առաջին բացասական թվից հետո
պետքա insert անեք նոր թիվ՝ տվյալ բացասական էլեմենտի ինդեքսը։ Կրկնում եմ՝ insert,
ու ոչ թե replace. Դրանից կախված թե ոնց պետքա հիշողության մեջ array վերցնեք,
անհրաժեշտության դեպքում ոնց փոխեք տվյալ անունով array-ի չափը և այլն, ձեր գործնա։ */
public class InsertNumAfterNegativeNumbers {
    public static void main(String[] args) {
          int[] array = {0, 1, -1, 5, -5, 10, 20, 30, -40};
       // int[] array = {0, 1, 5, 10, 20, 30, -40};
        //int[] array = {0, 1, 5, 10, 20, 30};
        int negativeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeIndex = i;
                break;
            }
        }

        if (negativeIndex == -1) {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
            return;
        }

        int[] newArray = new int[array.length + 1];

        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == negativeIndex + 1) {
                newArray[i] = negativeIndex;
            } else {
                newArray[i] = array[j];
                j++;
            }
        }

        System.out.print("[");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}