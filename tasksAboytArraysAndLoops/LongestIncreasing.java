package tasksAboytArraysAndLoops;
/*Գրել ծրագիր, որը կգտնի տվյալ զանգվածում ամենաերկար աճող հաջորդականության երկարությունը։*/
public class LongestIncreasing {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, -1, 5, 88, 9};
        //int[] arr = {5,9, -2, -3, 7};
        int[] arr = {3, 4, 5, 2, 7, 8, 9};
        int maxLen = 0;
        int currentLen = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLen++;
            } else {
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                }
                currentLen = 0;
            }
        }
        if (currentLen > maxLen) {
            maxLen = currentLen;
        }
        System.out.println(maxLen);
    }
}