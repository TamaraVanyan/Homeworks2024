package tasksAboutMethods;
/*Ունեք զանգված, որի մեջ կան տարբեր դրական ամբողջ թվեր. հեշտության համար array-ը ուղիղ
հայտարարեք ու ինիցալիզացրեք կոդի մեջ։ Ձեզնից պահանջվումա գրել ծրագիր, որը կստուգի array-ի
հերթական անդամի պարզ լինել-չլինելը ու կտպի համապատասխան հաղորդագրություն։ Յուրաքանչյուր
անդամի պարզ լինել-չլինելը պետքա ստուգբի առանձին մեթոդով։ Նորից եմ շեշտում, յուրաքանչյուր թվի
ստուգելը պետքա լինի առանձին մեթոդով, ոչ թե ամբողջ array-ինը։ Ձեր մեթոդը պետքա վերադարձնի
սխալա թե ճիշտ, որ array-ի հերթական թիվը պարզա։*/
public class PrimeNumOfArr {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 3, 5, 8, 13, 12, 17};

        for (int num : array) {
            if (isPrime(num)) {
                System.out.println(num + " - Is prime number");
            } else {
                System.out.println(num + " - is not prime number");
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
