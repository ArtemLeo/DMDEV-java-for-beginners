
/*
 * Task 2: Дано целое число. Определить, является ли последняя цифра данного числа - цифрой "3" или "72".
 */

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        // Определить, является ли последняя цифра данного числа - цифрой "3";
        if (number1 % 10 == 3) {
            System.out.println("Yes " + number1 + " ends in \"3\"");
        } else {
            System.out.println("No " + number1 + " don`t ends in \"3\"");
        }

        // Определить, является ли последняя цифра данного числа - цифрой "72";
        int number2 = scanner.nextInt();
        if (number2 % 100 == 72) {
            System.out.println("Yes " + number2 + " ends in \"72\"");
        } else {
            System.out.println("No " + number2 + " don`t ends in \"72\"");
        }
    }
}
