import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int start = scanner.nextInt();

        int sum = 0;
        int power = start;

        while (sum < number) {
            String powerString = String.valueOf(power);
            int digitSum = calculateDigitSum(powerString, power + 1);

            if (digitSum == number) {
                System.out.println("Сумма последовательных степеней равна произведению числа: " + number);
                return;
            }

            power++;
            sum += digitSum;
        }

        System.out.println("Сумма последовательных степеней не равна произведению числа: " + number);
    }

    private static int calculateDigitSum(String number, int power) {
        int sum = 0;
        for (char c : number.toCharArray()) {
            int digit = Character.getNumericValue(c);
            sum += Math.pow(digit, power);
            power++;
        }
        return sum;
    }
}
