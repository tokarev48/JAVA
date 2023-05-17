import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String secretCode = generateCode();
        System.out.println("Код загадан. У вас есть 20 попыток, чтобы его разгадать.");

        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count < 20) {
            System.out.println("Введите свой вариант (четыре цифры, разделенные пробелом): ");
            String[] guess = sc.nextLine().split(" ");
            if (guess.length != 4) {
                System.out.println("Неправильный формат. Введите четыре цифры, разделенные пробелом.");
                continue;
            }

            int bulls = countBulls(guess, secretCode);
            if (bulls == 4) {
                System.out.println("Вы угадали код!");
                return;
            } else {
                int cows = countCows(guess, secretCode) - bulls;
                System.out.println("Быков: " + bulls + ", коров: " + cows);
            }
            count++;
        }

        System.out.println("Вы проиграли. Код был: " + secretCode);
    }

    public static String generateCode() {
        String[] digits = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String code = "";
        for (int i = 0; i < 4; i++) {
            int index = (int) (Math.random() * digits.length);
            code += digits[index];
        }
        return code;
    }

    public static int countBulls(String[] guess, String code) {
        int bulls = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i].equals(code.substring(i, i + 1))) {
                bulls++;
            }
        }
        return bulls;
    }

    public static int countCows(String[] guess, String code) {
        int cows = 0;
        for (int i = 0; i < guess.length; i++) {
            if (code.indexOf(guess[i]) != -1) {
                cows++;
            }
        }
        return cows;
    }
}