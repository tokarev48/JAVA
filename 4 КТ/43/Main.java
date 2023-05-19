public class Main {
    public static void main(String[] args) {
        int[][] pyramid = {
                {3},
                {7, 4},
                {2, 4, 6},
                {8, 5, 9, 3}
        };
        int maxSum = getMaxSlideSum(pyramid);
        System.out.println(maxSum);
    }

    private static int getMaxSlideSum(int[][] pyramid) {
        int n = pyramid.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = pyramid[n - 1][i];
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = Math.max(pyramid[i][j] + dp[i + 1][j], pyramid[i][j] + dp[i + 1][j + 1]);
            }
        }

        return dp[0][0];
    }
}
