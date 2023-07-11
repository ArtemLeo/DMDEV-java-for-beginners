
/*
 * Task 11: Написать программу, которая проходит циклом по английскому алфавиту,
 * начиная с буквы 'b', и выводит каждую букву до тех пор, пока не встретит гласную
 * (т.е. вывести согласные в консоль).
 */

public class Task_11 {
    public static void main(String[] args) {
        char startChar = 'f';
        System.out.println("Start char is: " + startChar);
        printLetter(startChar);
    }

    private static void printLetter(char startChar) {
        for (char currentChar = startChar; !isVowel(currentChar); currentChar++) {
            System.out.println(currentChar);
        }
    }

    private static boolean isVowel(char vowel) {
        return vowel == 'a' || vowel == 'e' || vowel == 'o' || vowel == 'y' || vowel == 'i' || vowel == 'u';
    }
}
