package tasksAboytArraysAndLoops;
/* Դուք պետքա ստուգեք, թե արդյոք 2-րդ զանգվածը պարունակվումա առաջինի
 մեջ թե չէ ու տպեք համապատասխան հաղորդագրություն։*/
public class ArrayConteinsAnotherArray {
    public static void main(String[] args) {
        //int[] arr1 = {5, 7, 8, 0, -2, 4};
        int[] arr1 = {9, 1, -3, 4, 7};
        //int[] arr2 = {8, 0, -2};
        int[] arr2 = {1, -3, 8, 7};

        boolean allFound = true;

        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                allFound = false;
                break;
            }
        }
        System.out.println(allFound);
    }
}