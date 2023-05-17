import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            maxLength = Math.max(maxLength, findPalindromeLength(str, i, i));
            maxLength = Math.max(maxLength, findPalindromeLength(str, i, i + 1));
        }
        System.out.println(maxLength);
    }

    private static int findPalindromeLength(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}