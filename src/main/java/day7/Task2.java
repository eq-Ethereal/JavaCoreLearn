package day7;

public class Task2 {
    public static void main(String[] args) {
        Player p = new Player();
        Player player = new Player();
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        while (p.getStamina() >= 0){
            p.run();
        }
        System.out.println(Player.countPlayers);
        Player player6 = new Player();
        Player player7 = new Player();
    }
}
