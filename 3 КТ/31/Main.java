import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        long a = 0;
        long b = 1;
        for(int j=2; j<=i; j++) {
            long c = a + b;
            a = b;
            b = c;
        }
        String numStr = String.valueOf(b);
        int[] digitCounts = new int[10];
        for(char c : numStr.toCharArray()) {
            digitCounts[c-'0']++;
        }
        int maxDigitCount = 0;
        int maxDigit = -1;
        for(int k=0; k<digitCounts.length; k++) {
            if(digitCounts[k] > maxDigitCount) {
                maxDigitCount = digitCounts[k];
                maxDigit = k;
            }
        }
        System.out.println(maxDigit);
    }
}