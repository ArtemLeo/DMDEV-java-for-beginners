
/*
 * Task 15: Написать метод equals, который определяет, равны ли между собой текущие элементы в 2-х мерных массивах.
 */

public class Task_15 {
    public static void main(String[] args) {
        int[][] values1 = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {7, 8}
        };

        int[][] values2 = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {7, 8}
        };
        System.out.println("Those arrays are equal: " + equalsArray(values1, values2));
    }

    public static boolean equalsArray(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            int[] array1 = arr1[i];
            int[] array2 = arr2[i];
            if (array1.length != array2.length) {
                return false;
            }
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] != array2[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
