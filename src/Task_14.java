
/*
 * Написать программу, заносящую в массив первые 100 целых чисел, делящихся на 13 или на 17.
 * Результат вывести в консоль.
 */

import java.util.Arrays;

public class Task_14 {
    public static void main(String[] args) {
        int[] array = new int[100];
        fillArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void fillArray(int[] values) {
        int currentIndex = 0;
        for (int currentValue = 1; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex] = currentValue;
                currentIndex++;
            }
        }
    }
}
