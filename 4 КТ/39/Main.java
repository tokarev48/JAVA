import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int number = 23;

        int nextGreaterNumber = findNextGreaterNumber(number);

        System.out.println(nextGreaterNumber);
    }

    private static int findNextGreaterNumber(int number) {
        String numberStr = String.valueOf(number);
        char[] digits = numberStr.toCharArray();
        int n = digits.length;

        // Находим самую правую цифру, которую можно заменить
        int i = n - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // Если такой цифры нет, возвращаем -1
        if (i == -1) {
            return -1;
        }

        // Находим наименьшую цифру, большую найденной цифры, справа от нее
        int j = n - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Меняем найденные цифры местами
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Сортируем оставшиеся цифры после измененной цифры в порядке возрастания
        Arrays.sort(digits, i + 1, n);

        return Integer.parseInt(new String(digits));
    }
}
