public class Main {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";

        String sum = addStrings(num1, num2);
        System.out.println(sum);
    }

    private static String addStrings(String num1, String num2) {
        int m = num1.length() - 1;
        int n = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (m >= 0 || n >= 0 || carry > 0) {
            int x = m >= 0 ? num1.charAt(m) - '0' : 0;
            int y = n >= 0 ? num2.charAt(n) - '0' : 0;
            int sum = x + y + carry;
            result.append(sum % 10);
            carry = sum / 10;

            m--;
            n--;
        }

        return result.reverse().toString();
    }
}
