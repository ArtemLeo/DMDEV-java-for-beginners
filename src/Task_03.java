
/*
 * Task 3: Дано целое число. Это число - сумма денег в долларах.
 * Вывести в консоль данное число, добавив к нему слово "доллар" в правильном падеже.
 * ("доллар", "доллара", "долларов")
 */

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dollar = scanner.nextInt();

        /*
         * 1, !11 "доллар"
         * 2-4, !12-14 "доллара"
         * 5-9, 0, 11-19 "долларов"
         */

        if (dollar % 10 == 0 || (dollar % 10 >= 5 && dollar % 10 <= 9) || (dollar % 100 >= 11 && dollar % 100 <= 19)) {
            System.out.println(dollar + " долларов");
        } else if (dollar % 10 >= 2 && dollar % 10 <= 4) {
            System.out.println(dollar + " доллара");
        } else if (dollar % 10 == 1) {
            System.out.println(dollar + " доллар");
        } else {
            System.out.println("Invalid input, please try again!");
        }
    }
}

