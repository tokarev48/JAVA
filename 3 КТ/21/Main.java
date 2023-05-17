public class Main {
    public static void main(String[] args) {
        String nums = "789";
        String result = nums.replaceAll("[789]", "5").replaceAll("[456]", "4")
                .replaceAll("[123]", "3").replaceAll("[0]", "0");
        System.out.println(result);
    }
}