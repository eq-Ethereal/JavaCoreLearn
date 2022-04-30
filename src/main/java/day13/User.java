package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    List<User> subscriptions = new ArrayList<>();
    List<User> friends = new ArrayList<>();

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
        if(user.getSubscriptions().contains(this)){
            friends.add(user);
            user.friends.add(this);
        }
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return (subscriptions.contains(user) & user.getSubscriptions().contains(this));
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", subscriptions=" + subscriptions +
                ", friends=" + friends +
                '}';
    }
}
