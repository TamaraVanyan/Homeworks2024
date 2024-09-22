package tasksAboutMethods;
/*Ունեք nxn չափի մատրիցա, n-ը որոշեք դուք։ Պետքա գրել ծրագիր,
որը կհաշվի մատրիցայի անկյունագծերի վրայի թվերի գումարը։*/
public class SumMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };

        int sum = Sum(matrix);
        System.out.println("Sum of matrix diagonal numbers 5x5։ " + sum);
    }
public static int Sum(int[][] matrix) {
    int n = 5;
    int primarySum = 0;
    int secondarySum = 0;

    for (int i = 0; i < n; i++) {
        primarySum += matrix[i][i];
        secondarySum += matrix[i][n - 1 - i];
    }

    int middleIndex = n / 2;
    return primarySum + secondarySum - matrix[middleIndex][middleIndex];
}
}