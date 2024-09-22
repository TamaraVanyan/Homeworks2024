package tasksAboutMethods;
/*Ունեք սովորական String փոփոխական, որի մեջ անգլերեն տառերով տեքստա գրած պրոբելներով։
Դուք պիտի գրեք մեթոդ, որը կստանաս տվյալ String-ը որպես պարամետր ու կվերադարձնի
String-ում բառերի քանակը։
Բառ համարվումա ցանկացած մինիմում >=1 տառ(եր)ի հաջորդականությունը
Պրոբելների քանակը կարա լինի 1-ից ավել տեքստի մեջ ցանկացած 2 բառի արանքում*/
public class CountOfWords {
    public static void main(String[] args) {
        String text1 = "I am stupid person";
        String text2 = "I want go to       sleep";
        String text3 = "I am tierd bla, bla,    nanana, blabla and more then bla bla";
        System.out.println(countWords(text1));
        System.out.println(countWords(text2));
        System.out.println(countWords(text3));
    }

    public static int countWords(String text) {
        int count = 0;
        boolean isWord = false;
        int length = text.length();

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);

            if (currentChar != ' ') {
                if (!isWord) {
                    count++;
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }
        return count;
    }
}