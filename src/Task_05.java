
/*
 * Необходимо найти самое большое число, из представленных;
 */

public class Task_05 {
    public static void main(String[] args) {
        int first = 5;
        int second = 10;
        int max = getMax(first, second);
        System.out.println(max);

        int maxMath = Math.max(first,second);
        System.out.println(maxMath);
    }

    public static int getMax(int value1, int value2) {
        if (value1 > value2) {
            return value1;
        } else {
            return value2;
        }
    }
}
