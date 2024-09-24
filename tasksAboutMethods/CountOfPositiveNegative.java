package tasksAboutMethods;
/*Գրեք մեթոդ, որը կընդունի ամբողջ թվերի զանգված։ Ձեր խնդիրնա գտնել մեթոդին
փոխանցված array-ում դրական ու բացասական թվերի հարաբերակցությունը` positive / negative,
 ու վերադարձնել տվյալ double թիվը։ Եթե չլինեն բացասական թվեր, թող վերադարձնի -1։*/

public class CountOfPositiveNegative {
    public static void main(String[] args) {

        int[] array = {5, -3, 2, -7, 4, -1};
        double haraberakcutyun = calculateRatio(array);

        if (haraberakcutyun == -1) {
            System.out.println("There are not negative numbers");
        } else {
            System.out.println("the ratio of positive to negative numbers is: " + haraberakcutyun);
        }
    }

    public static double calculateRatio(int[] array) {
        int posCount = 0;
        int negCount = 0;

        for (int i = 0; i < array.length; i++) {
            int num = array[i];

            if (num > 0) {
                posCount++;
            } else if (num < 0) {
                negCount++;
            }
        }

        if (negCount == 0) {
            return -1;
        }
        return (double) posCount / negCount;
    }
}