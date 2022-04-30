package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Дмитрий Обалденный");
        User user2 = new User("Татьяна Прекрасная");
        User user3 = new User("Рандомный Пидорас");

        user1.sendMessage(user2, "Таня, блеать, ты 13 задачу сделала ?");
        user1.sendMessage(user2,"Алло");
        user2.sendMessage(user1, "Нит");
        user2.sendMessage(user1, "Я тут ваще то в Сочи");
        user2.sendMessage(user1, "И у меня лапки ");
        user1.sendMessage(user2,"Ну ахуеть блять");
        MessageDatabase.showDialog(user1, user2);
    }
}
