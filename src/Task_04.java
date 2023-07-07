import java.util.Scanner;

/* Написать программу, которая по полученному году определяет, является ли этот год високосным.
 * Год считается високосным, если он делится без остатка на 4. Однако, если год также делится на 100,
 * то этот год - не високосный, за исключением годов, делящихся на 400.
 * Например:
 *  1992 - високосный
 *  1900 - не високосный
 *  2000 - високосный
 */
public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        isLeapYearVOID(scanner.nextInt());

        boolean result = isLeapYearRETURN(scanner.nextInt());
        System.out.println("Високосный - " + result);


    }

    public static void isLeapYearVOID(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " - високосный");
        } else {
            System.out.println(year + " - не високосный");
        }
    }

    public static boolean isLeapYearRETURN(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}

