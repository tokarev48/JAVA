import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        System.out.println(formRanges(arr));
    }

    public static String formRanges(int[] arr) {
        StringBuilder sb = new StringBuilder();
        int n = arr.length;
        int i = 0;
        while (i < n) {
            sb.append(arr[i]);
            int j = i;
            while (j < n - 1 && arr[j + 1] == arr[j] + 1) {
                j++;
            }
            if (i != j) {
                sb.append("-");
                sb.append(arr[j]);
                i = j + 1;
            } else {
                i++;
            }
            if (i < n) {
                sb.append(",");
            }
        }

        return sb.toString();
    }
}