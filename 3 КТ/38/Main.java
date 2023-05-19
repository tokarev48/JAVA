public class Main {
    public static void main(String[] args) {
        String text = "Привет, как дела? Я учусь программированию!";

        String modifiedText = modifyText(text);

        System.out.println(modifiedText);
    }

    private static String modifyText(String text) {
        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                currentWord.append(c);
            } else {
                if (currentWord.length() > 0) {
                    result.append(currentWord.substring(1)).append(currentWord.charAt(0)).append("ауч");
                    currentWord.setLength(0);
                }
                result.append(c);
            }
        }

        if (currentWord.length() > 0) {
            result.append(currentWord.substring(1)).append(currentWord.charAt(0)).append("ауч");
        }

        return result.toString();
    }
}
