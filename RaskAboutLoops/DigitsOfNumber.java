package RaskAboutLoops;

/*Ունեք ցանկացած չափի դրական ամողջ թիվ։
Տպեք տվյալ թվի բոլոր թվանշանները՝ ձախից աջ։ Ձեր սկզբնական թիվը կարաք փոփոխեք ոնց ուզեք։*/
public class DigitsOfNumber {
    public static void main(String[] args) {
        //int number = 1234;
//        int number = 123456;
        int number = 1234567890;

        int num1 = 1;
        int temp = number;
        while (temp > 9) {
            temp = temp / 10;
            num1 = num1 * 10;
        }
        while (num1 > 0) {
            int digit = number / num1;
            System.out.print(digit + ", ");
            number %= num1;
            num1 = num1 / 10;
        }
    }
}