import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = 0;
        int lastDigitValue = 0;
        for (int i = 0; i < s.length(); i++) {
            int digitValue = getRomanDigitValue(s.charAt(i));
            n += digitValue;
            if (lastDigitValue < digitValue) {
                n -= 2 * lastDigitValue;
            }
            lastDigitValue = digitValue;
        }
        System.out.println(n);
    }

    public static int getRomanDigitValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}