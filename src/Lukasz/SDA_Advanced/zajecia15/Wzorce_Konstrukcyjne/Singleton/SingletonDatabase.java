package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingletonDatabase {

    private List<User> userList;
    private static SingletonDatabase instance;
    private static Integer counter = 1;

    private SingletonDatabase() {
        this.userList = new ArrayList<>();
    }

    public static SingletonDatabase getInstance() {
        if (instance == null) {
            instance = new SingletonDatabase();
        }
        return instance;
    }

    public List<User> addUser(User user) {
        user.setId(counter++);
        userList.add(user);
        return userList;
    }

    public List<User> removeUser(User user) {
        userList.remove(user);
        return userList;
    }

    public List<User> getUser(String name) {
        User showUser = null;
        for (User user : userList) {
            if (user.getLastName().equalsIgnoreCase(name)) {
                showUser = user;
            }
        }
        return Collections.singletonList(showUser);

    }

    public void showList() {
        for (User u : userList) {
            System.out.println(u);
        }
    }



}
