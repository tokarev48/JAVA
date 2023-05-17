import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во палочек: ");
        long num = sc.nextLong();
        long tanya = num; 
        boolean sashaTurn = false;
        while (num > 1) {
            if (num % 2 == 0) {
                if (sashaTurn) num /= 2;
                else num--;
            } else {
                num--;
            }
            sashaTurn = !sashaTurn;
            if (!sashaTurn) tanya = num;
        }
        System.out.println("Кол-во палочек у Тани - " + tanya); //
    }
}