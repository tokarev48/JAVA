public class Main {
    public static void main(String[] args) {
        double a = 5.0;
        double b = 4.0;
        double c = 3.0;

        double p = (a + b + c) / 2;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(square);
    }
}