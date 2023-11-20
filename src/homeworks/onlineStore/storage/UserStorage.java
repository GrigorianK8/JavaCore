package homeworks.onlineStore.storage;

import homeworks.onlineStore.model.User;
import homeworks.onlineStore.model.enums.UserType;
import homeworks.onlineStore.util.StorageSerializeUtil;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class UserStorage implements Serializable {

    private Map<String, User> userMap = new HashMap<>();

    public void add(User user) {
        userMap.put(user.getEmail(), user);
        StorageSerializeUtil.serializeUserStorage(this);
    }

    public void print() {
        for (User user : userMap.values()) {
            System.out.println(user);
        }
    }

    public User getByEmail(String email) {
        return userMap.get(email);
    }

    public void printByType(UserType userType) {
        for (User user : userMap.values()) {
            if (user.getUserType() == userType) {
                System.out.println(user);
            }
        }
    }
}