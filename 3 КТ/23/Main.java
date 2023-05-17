public class Main {
    public static void main(String[] args) {
        int n = 10;
        int a = 2;
        int b = 3;

        int sum = sumDivisibleBy(n, a) + sumDivisibleBy(n, b) - sumDivisibleBy(n, lcm(a, b));
        System.out.println(sum);
    }

    public static int sumDivisibleBy(int n, int divisor) {
        int p = n / divisor;
        return divisor * (p * (p + 1)) / 2;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}