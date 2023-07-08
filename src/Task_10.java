
/*
 * Написать программу, которая определяет, является ли введенное число простым,
 * т.е. делится без остатка только на 1 и само на себя.
 */


public class Task_10 {
    public static void main(String[] args) {
        int number = 11;
        System.out.println("Is the number simple? - " + isSimple(number));
    }

    public static boolean isSimple(int number) {
        boolean result = true;
        for (int currentValue = 2; currentValue < number; currentValue++) {
            if (number % currentValue == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
