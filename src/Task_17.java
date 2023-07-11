
/*
 * Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
 */

public class Task_17 {
    public static void main(String[] args) {
        int[] array = {3, 76, 36, 0, 76, -5, 98, 3, -7, 54, 17, -8, 35};
        System.out.println("Index of MaxValue in array = " + Task_16.valueMax(array));
        System.out.println("Index of MinValue in array = " + Task_16.valueMin(array));
        System.out.println("Max value: " + array[6]);
        System.out.println("Min value: " + array[11]);
        System.out.println("-------------------------------");
        System.out.println("Sum1() of elements = " + sum(array));
        System.out.println("-------------------------------");
        System.out.println("Sum2() of elements = " + sum2(array));
    }

    public static int sum(int[] values) {
        int result = 0;
        int minIndex = Task_16.valueMin(values);
        int maxIndex = Task_16.valueMax(values);

        // Math.min() & Math.max();
        int startIndex = Math.min(minIndex, maxIndex);
        int endIndex = Math.max(minIndex, maxIndex);
        for (int i = startIndex + 1; i < endIndex; i++) {
            result += values[i];
        }
        return result;
    }

    // Rule of "Three glasses";
    public static int sum2(int[] values) {
        int result = 0;
        int startIndex = Task_16.valueMin(values);
        int endIndex = Task_16.valueMax(values);
        System.out.println(startIndex + " : " + endIndex);
        if (startIndex > endIndex) {
            int temp = startIndex;
            startIndex = endIndex;
            endIndex = temp;
        }
        System.out.println(startIndex + " : " + endIndex);
        for (int i = startIndex + 1; i < endIndex; i++) {
            result += values[i];
        }
        return result;
    }
}
