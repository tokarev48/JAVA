import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;
        while (scanner.hasNextInt()) {
            int divisor = scanner.nextInt();
            for (int i = m; i <= n; i++) {
                if (i % divisor == 0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}