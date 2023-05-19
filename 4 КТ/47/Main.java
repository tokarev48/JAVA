import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result = new ArrayList<>();
        snail(array, 0, 0, array.length - 1, array[0].length - 1, result);
        System.out.println(result);
    }

    public static void snail(int[][] array, int startRow, int startCol, int endRow, int endCol, List<Integer> result) {
        if (startRow > endRow || startCol > endCol) {
            return;
        }

        // Top row
        for (int j = startCol; j <= endCol; j++) {
            result.add(array[startRow][j]);
        }

        // Right column
        for (int i = startRow + 1; i <= endRow; i++) {
            result.add(array[i][endCol]);
        }

        // Bottom row
        for (int j = endCol - 1; j >= startCol && startRow < endRow; j--) {
            result.add(array[endRow][j]);
        }

        // Left column
        for (int i = endRow - 1; i > startRow && startCol < endCol; i--) {
            result.add(array[i][startCol]);
        }

        snail(array, startRow + 1, startCol + 1, endRow - 1, endCol - 1, result);
    }
}