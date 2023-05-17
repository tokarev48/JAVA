import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + (i + 1) + " элемент массива: ");
            array[i] = scanner.nextInt();
        }

        int maxIndex = 0;
        int[] leftArray = new int[n];
        int[] rightArray = new int[n];

        for (int i = 1; i < n; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        int leftIndex = 0;

        for (int i = 0; i < maxIndex; i++) {
            leftArray[leftIndex++] = array[i];
        }

        int rightIndex = 0;

        for (int i = maxIndex + 1; i < n; i++) {
            rightArray[rightIndex++] = array[i];
        }

        System.out.println("Максимальное значение: " + array[maxIndex]);
        System.out.println("Элементы слева от максимального значения: " + Arrays.toString(Arrays.copyOfRange(leftArray, 0, leftIndex)));
        System.out.println("Элементы справа от максимального значения: " + Arrays.toString(Arrays.copyOfRange(rightArray, 0, rightIndex)));
    }
}
