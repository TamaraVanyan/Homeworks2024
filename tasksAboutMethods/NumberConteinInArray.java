package tasksAboutMethods;
/*պիտի գրեք մեթոդ, որը կստանաս ամբողջ թվերի array ու ևս մեկ՝ array-ի տիպն ունեցող պարամետր։
 Ձեր մեթոդը պետքա վերադարձնի true, եթե էդ թիվը պարունակվումա array-ի մեջ, ու false,
 եթե չի պարունակվում։*/
public class NumberConteinInArray {
    public static void main(String[] args) {
        int[] array = {0, 5, 15, 25, 73, 31};

        System.out.println(contains(array, 5));
        System.out.println(contains(array, 17));
    }

    public static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}
