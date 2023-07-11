
/*
 * Написать 2-ва метода, которые определяют индекс минимального и максимального элемента в одномерном массиве.
 */

public class Task_16 {
    public static void main(String[] args) {
        int[] array = {3, 76, 36, 0, 76, -5, 98, 3, -7, 54, 17, -8, 35};
        System.out.println("Index of MaxValue in array = " + valueMax(array));
        System.out.println("Index of MinValue in array = " + valueMin(array));
        System.out.println("Max value: " + array[6]);
        System.out.println("Min value: " + array[11]);
    }

    public static int valueMin(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int valueMax(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
