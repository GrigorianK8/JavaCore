package homeworks.onlineshop.storage;

import homeworks.onlineshop.model.User;

public class UserStorage {

    private User[] users = new User[10];
    private int size;

    public void printUsers() {
        if (size == 0) {
            System.out.println("No users found!");
            return;
        }
        for (int i = 0; i < size; i++) {
            User user = users[i];
            System.out.println("Users ---------------");
            System.out.println("User ID: " + user.getId());
            System.out.println("User Name: " + user.getName());
            System.out.println("User Email: " + user.getEmail());
            System.out.println("User Type: " + user.getUserType());
            System.out.println("----------------------");
        }
    }

    public void addUser(User user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
    }

    public User getUserByEmailAndPassword(String email, String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email) && users[i].getPassword().equals(password)) {
                return users[i];
            }
        }
        return null;
    }

    public boolean thisEmailBusy(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].equals(email)) {
                return true;
            }
        }
        return false;
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users = tmp;
    }
}