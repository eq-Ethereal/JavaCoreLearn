package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messages.add(message);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message message :
                messages) {
            if (isHaveDialog(u1,u2,message)) {
                System.out.println(message.getSender().getUserName() + ": " + message.getText());
            }
        }
    }
    private static boolean isHaveDialog(User u1, User u2, Message message){
        return ((message.getReceiver().equals(u1) & message.getSender().equals(u2)) || message.getReceiver().equals(u2) & message.getSender().equals(u1));
    }
}
