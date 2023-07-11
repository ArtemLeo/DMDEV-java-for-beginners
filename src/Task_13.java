
/*
 * Task 13: Написать программу, которая печатает массив сначала в обычном порядке, затем в обратном.
 */


public class Task_13 {
    public static void main(String[] args) {
        int[] array = {3, 5, 84, 98, 14, 75, 38, 95};
        arrayToConsoleFor(array);
        System.out.println();
        arrayToConsoleForEach(array);
        System.out.println();
        reverseArray(array);
    }

    public static void arrayToConsoleFor(int[] array) {
        System.out.print("Array for: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void arrayToConsoleForEach(int[] array) {
        System.out.print("Array forEach: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void reverseArray(int[] array) {
        System.out.print("Reverse array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
