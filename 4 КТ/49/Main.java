public class Main {
    public static void main(String[] args) {
        int n = 10;
        int result = fuscIterative(n);
        System.out.println(result);
    }

    public static int fuscIterative(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;

        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                int m = (n - 1) / 2;
                a = a + b;
                n = m;
            }
            b = a + b;
        }

        return b;
    }
}
