import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int i = 10;

        long fibonacci = computeFibonacci(i);
        System.out.println("i-ый элемент ряда Фибоначчи: " + fibonacci);

        int maxDigitCount = findMaxDigitCount(fibonacci);
        System.out.println("Наибольшее вхождение цифры: " + maxDigitCount);
    }

    private static long computeFibonacci(int n) {
        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    private static int findMaxDigitCount(long number) {
        int[] digitCount = new int[10];

        while (number > 0) {
            int digit = (int) (number % 10);
            digitCount[digit]++;
            number /= 10;
        }

        int maxCount = 0;
        int maxDigit = 0;

        for (int digit = 0; digit < 10; digit++) {
            int count = digitCount[digit];

            if (count > maxCount || (count == maxCount && digit > maxDigit)) {
                maxCount = count;
                maxDigit = digit;
            }
        }

        return maxDigit;
    }
}
