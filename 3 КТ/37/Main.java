import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество игроков: ");
        int numberOfPlayers = sc.nextInt();
        System.out.println("Введите номер игрока с которого начинается игра: ");
        int startingPlayer = sc.nextInt();

        List<Integer> players = new ArrayList<>();
        for (int i = 1; i <= numberOfPlayers; i++) {
            players.add(i);
        }

        List<Integer> outPlayers = new ArrayList<>();
        int count = startingPlayer - 1;
        while (players.size() > 1) {
            for (int i = 0; i < 2; i++) {
                count++;
                if (count == players.size()) {
                    count = 0;
                }
            }
            outPlayers.add(players.remove(count));
            count--;
        }

        outPlayers.add(players.get(0));
        System.out.println("Выбывшие игроки: " + outPlayers.toString());
    }
}