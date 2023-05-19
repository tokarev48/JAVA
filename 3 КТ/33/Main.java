public class Main {
    public static void main(String[] args) {
        long n = 10;

        long tanyaSticks = calculateTanyaSticks(n);
        System.out.println("Количество палочек у Тани: " + tanyaSticks);
    }

    private static long calculateTanyaSticks(long n) {
        return (n - (n % 2)) / 2;
    }
}
