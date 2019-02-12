package com.cs991.ywb18142.mytestapp;

import java.util.ArrayList;


public class UserDatabase {

    ArrayList<User> users;

    public UserDatabase() {

        users = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {

        return users;
    }

    public void addUser(User user) {

        users.add(user);
    }

    public void printDetails() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(i);
            System.out.println(users.get(i).getName());
            System.out.println(users.get(i).getAddress());

        }
    }

    public boolean checkExists(String email) {
        boolean alreadyExists = false;
        for(int i = 0; i < users.size(); i++) {
            if(users.get(i).getEmail().equals(email)) {
                alreadyExists = true;
                return alreadyExists;
            }
        }
        return alreadyExists;
    }
}

