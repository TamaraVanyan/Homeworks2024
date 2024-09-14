package TasksAboutArrays;

public class PositivNumbersReversdArray {
    public static void main(String[] args) {

        double[]  array = {2.25, 3.4, -6.9, 7.8, -3.14};
        //double[]  array = {-2.25, -3.4, -6.9, -7.8, -3.14};
        //double[]  array = {2.25, 3.4, 6.9, 7.8, 3.14};

        double[] reversedArray = new double[5];

        int index = array.length-1;

        if (array[0] >= 0) {
            reversedArray[index] = array[0];
            index--;
        }
        if (array[1] >= 0) {
            reversedArray[index] = array[1];
            index--;
        }
        if (array[2] >= 0) {
            reversedArray[index] = array[2];
            index--;
        }
        if (array[3] >= 0) {
            reversedArray[index] = array[3];
            index--;
        }
        if (array[4] >= 0) {
            reversedArray[index] = array[4];
            index--;
        }

        System.out.println("Original array is: ");
        System.out.print(array[0] + " ");
        System.out.print(array[1] + " ");
        System.out.print(array[2] + " ");
        System.out.print(array[3] + " ");
        System.out.println(array[4] + " ");

        System.out.println("Reversed and with positive numbers array is: ");
        System.out.print(reversedArray[0] + " ");
        System.out.print(reversedArray[1] + " ");
        System.out.print(reversedArray[2] + " ");
        System.out.print(reversedArray[3] + " ");
        System.out.println(reversedArray[4] + " ");
    }
}
