package lab9;

import java.util.*;

public class GameScores {

    Map<String, Integer> scores = new HashMap<>();

    public void findUserScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();

        Integer score = scores.get(name);

        if (score != null) {
            System.out.println(name + " имеет " + score + " очков");
        } else {
            System.out.println("Пользователь '" + name + "' не найден");
            System.out.println("Доступные: " + scores.keySet());
        }
    }

    public void setScores(String name, int score) {
        scores.put(name, score);
    }
}
