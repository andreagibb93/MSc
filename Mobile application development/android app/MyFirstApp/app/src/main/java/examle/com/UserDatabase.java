package examle.com;

import java.util.ArrayList

public class UserDatabase {

    //declaration
    ArrayList<User> users;

    //constructor, populating the arraylist with User objects, arraylist called users
    public UserDatabase() {
        users = new ArrayList<>();
    }

    //get method
    public ArrayList<User> getUser() {
        return users;
    }

    // add user method to arraylist
    private void addUser(User user) {
        users.add(user);
    }

    //print details method
    public void printDetails() {
        for(int i = 0; i < users.size(); i++) {
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
        )
    }
