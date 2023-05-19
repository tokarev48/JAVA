import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int[] series = generateSeries(x);
        for (int num : series) {
            System.out.print(num + " ");
        }
    }

    public static int[] generateSeries(int x) {
        int[] series = new int[2 * x + 1];
        series[0] = 1;

        int index = 1;
        for (int i = 1; i <= x; i++) {
            int y = 2 * i + 1;
            int z = 3 * i + 1;

            if (!contains(series, y)) {
                series[index++] = y;
            }

            if (!contains(series, z)) {
                series[index++] = z;
            }
        }

        return Arrays.copyOf(series, index);
    }

    private static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
