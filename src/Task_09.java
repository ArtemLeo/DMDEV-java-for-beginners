
/*
 * В 1626 году индейцы продали Манхэттен за 24$.
 * Написать программу, которая вычисляет сумму, получившуюся в текущем году,
 * если бы индейцы положили эти деньги в банк под 5%.
 */

public class Task_09 {
    public static void main(String[] args) {
        int startYear = 1626;
        int endYear = 2023;
        double dollars = 24;
        double percent = 0.05;

        System.out.println("The amount of money in the account = " + calculate(startYear, dollars, percent) + " dollars, for " + endYear + " year");
    }

    public static double calculate(int startYear, double dollars, double percent) {
        double result = dollars;
        for (int countYear = startYear; countYear <= 2023; countYear++) {
            result += result * percent;
            System.out.println("In " + countYear + " year: " + result + " dollars");
        }
        return result;
    }
}

