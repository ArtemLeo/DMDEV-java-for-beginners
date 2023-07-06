
/*
 * Task 1: Дан порядковый номер месяца. Вывести в консоль пору года, к которой относится месяц.
 */

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        if (month == 12 || month == 1 || month == 2) {
            System.out.println(month + " month is WINTER");
        } else if (month >= 3 && month <= 5) {
            System.out.println(month + " month is SPRING");
        } else if (month >= 6 && month <= 8) {
            System.out.println(month + " month is SUMMER");
        } else if (month >= 9 && month <= 11) {
            System.out.println(month + " month is AUTUMN");
        } else {
            System.out.println("Invalid values entered: " + month);
        }
    }
}