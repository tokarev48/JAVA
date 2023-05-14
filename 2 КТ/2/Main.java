public class Main {
    public static void main(String[] args) {
        boolean[] values = {true, true, true, false, true, true, true, true, true, false, true, false, true, false, false, true, true, true, true, true, false, false, true, true};
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i]) {
                count++;
            }
        }
        System.out.println("Количество работников на предприятии: " + count);
    }
}