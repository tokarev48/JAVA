import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int start = scanner.nextInt();

        for (int i = 1; i <= 6; i++) {
            int res = 0;
            int pow = i;
            int n = start;
            while (n > 0) {
                int m = n % 10;
                res += Math.pow(m, pow);
                pow++;
                n /= 10;
            }
            if (num * i == res) {
                System.out.println("Possible: " + i);
                return;
            }
        }
        System.out.println("Not possible");
    }
}