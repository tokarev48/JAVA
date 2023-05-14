import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] arr = new Integer[3];

        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            if (arr[0] == null || num > arr[0]) {
                arr[2] = arr[1];
                arr[1] = arr[0];
                arr[0] = num;
            } else if (arr[1] == null || num > arr[1]) {
                arr[2] = arr[1];
                arr[1] = num;
            } else if (arr[2] == null || num > arr[2]) {
                arr[2] = num;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}