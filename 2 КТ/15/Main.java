import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = input.split(" ");
        String output = "";

        for (int i = 0; i < words.length; i++) {
            if (!output.contains(words[i])) {
                output += words[i] + " ";
            }
        }

        System.out.println(output.trim());
    }
}