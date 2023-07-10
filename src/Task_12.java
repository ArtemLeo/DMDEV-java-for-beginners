
/*
 * Рекурсия
 */

public class Task_12 {
    public static void main(String[] args) {
        int value = 5; // factorial = 120
        System.out.println("With Recursion: " + factorialRecursion(value));
        System.out.println("With Cycle: " + factorialCycle(value));
    }

    private static int factorialRecursion(int value) {
        if (value == 1) {
            return 1;
        }
        return value * factorialRecursion(value - 1);
    }

    private static int factorialCycle(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
