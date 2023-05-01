import java.util.Random;

public class Matrix {
    private int m[][];

    public Matrix(int size) {
        m = new int[size][size];
        Random rnd = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = rnd.nextInt(25) + 1;
            }
        }

    }

    public int sum() {
        int plus = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i > j) {
                    plus = plus + m[i][j];
                }
            }
        }
        return plus;
    }

    public int diff() {
        int subtraction = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i < j) {
                    subtraction = subtraction - m[i][j];
                }
            }
        }
        return subtraction;
    }

    public int mult() {
        int diagonal = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    diagonal = diagonal * m[i][j];
                }
            }
        }
        return diagonal;
    }


    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < m.length; i++, System.out.println()) {
            for (int j = 0; j < m[i].length; j++) {
                str.append(m[i][j]).append(" ");
            }
            str.append("\n");
        }
        return str.toString();
    }


}