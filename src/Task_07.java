
/*
 * Task 7: Написать программу, вычисляющую факториал введённого целого числа.
 */

public class Task_07 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of number " + number + " = " + factorial(number));

        System.out.println("Factorial of number " + number + " = " + factorialWhile(number));
    }

    public static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialWhile(int value) {
        int result = 1;
        int currentValue = 1;
        while (currentValue <= value) {
            result *= currentValue;
            currentValue++;
        }
        return result;
    }
}
