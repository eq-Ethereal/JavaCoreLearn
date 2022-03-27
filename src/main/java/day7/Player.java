package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    static int countPlayers;

    public Player() {
        Random r = new Random();
        this.stamina = r.nextInt(11) + 90;
        System.out.print("\nОчередняра со стаминой: " + stamina);
        if (countPlayers < 6 & countPlayers >= 0)
            countPlayers++;
        else if (countPlayers >= 6) System.out.println("  Сиди жди, щенок, места нет");
        else System.out.println("Ты чо, совсем дурак ?!");
    }

    public void run() {
        System.out.println("А я иду такая вся в Дольче Габбана");
        stamina--;
        if (stamina == 0) countPlayers--;
    }

    public void info() {
        if (countPlayers < 6 & countPlayers >= 0)
            System.out.println("Команды неполные. На поле еще есть" + (6 - countPlayers) + "свободных мест");
        else if (countPlayers >= 6) System.out.println("На поле нет свободных мест");
        else System.out.println("Ты чо, совсем дурак ?!");
    }

    public int getStamina() {
        return stamina;
    }
}

