import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = (int) Math.sqrt(n);
        System.out.println(n + " = " + (i * i) + "-" + ((i-1)*(i-1)));
    }
}