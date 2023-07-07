
/*
 * Дано целое число. Посчитать сумму цифр данного числа;
 */

public class Task_08 {
    public static void main(String[] args) {
        int number = 537;
        System.out.println(sum(number));

        int numberMinus = -537;
        System.out.println(sumMinus(numberMinus));

        System.out.println(sumWhile(numberMinus));
    }

    public static int sum(int value) {
        int result = 0;
        for (int i = value; i > 0; i /= 10) {
            result += i % 10;
        }
        return result;
    }

    public static int sumMinus(int value) {
        int result = 0;
        for (int i = (value > 0 ? value : value * -1); i > 0; i /= 10) {
            result += i % 10;
        }
        return result;
    }

    public static int sumWhile(int value) {
        int result = 0;
        int i = (value > 0 ? value : value * -1);
        while (i > 0) {
            result += i % 10;
            i /= 10;
        }
        return result;
    }
}
