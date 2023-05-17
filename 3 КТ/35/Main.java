import java.util.Scanner;

public class Main {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сообщение для расшифровки: ");
        String message = sc.nextLine();
        message = message.replaceAll("[^a-zA-Z]", "");

        for (int shifts = 0; shifts < 26; shifts++) {
            StringBuilder decryptedMessage = new StringBuilder();
            for (char c : message.toCharArray()) {
                if (!Character.isLetter(c)) {
                    decryptedMessage.append(c);
                    continue;
                }
                int alphabetIndex = ALPHABET.indexOf(Character.toLowerCase(c));
                int decryptedIndex = (alphabetIndex - shifts + 26) % 26;
                char decryptedChar = ALPHABET.charAt(decryptedIndex);
                if (Character.isUpperCase(c)) {
                    decryptedChar = Character.toUpperCase(decryptedChar);
                }
                decryptedMessage.append(decryptedChar);
            }

            System.out.println("Сдвиг на " + shifts + ": " + decryptedMessage.toString());
        }
    }
}