public class Main {
    public static void main(String[] args) {
        double[][] points = {{4, 6}, {12, 4}, {10, 10}};

        double x = (points[0][0] + points[1][0] + points[2][0]) / 3;
        double y = (points[0][1] + points[1][1] + points[2][1]) / 3;

        System.out.printf("Барицентр треугольника: {%.4f, %.4f}", x, y);
    }
}