public class Main {
    public static void main(String[] args) {
        int seconds = 3662;
        String time = formatTime(seconds);
        System.out.println(time);
    }

    private static String formatTime(int seconds) {
        int[] intervals = {365 * 24 * 60 * 60, 30 * 24 * 60 * 60, 7 * 24 * 60 * 60, 24 * 60 * 60, 60 * 60, 60, 1};
        String[] formats = {"год", "месяц", "неделя", "день", "час", "минута", "секунда"};

        StringBuilder formattedTime = new StringBuilder();
        boolean isPlural = false;

        for (int i = 0; i < intervals.length; i++) {
            int interval = intervals[i];
            if (seconds >= interval) {
                int amount = seconds / interval;
                seconds %= interval;

                if (formattedTime.length() > 0) {
                    formattedTime.append(", ");
                }

                if (amount > 1) {
                    isPlural = true;
                }

                formattedTime.append(amount).append(" ").append(formats[i]);
                if (isPlural) {
                    formattedTime.append(isPlural ? "a" : "");
                }

                isPlural = false;
            }
        }

        return formattedTime.toString();
    }
}
