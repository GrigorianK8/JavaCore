package homeworks.onlineStore.storage;

import homeworks.onlineStore.model.Order;
import homeworks.onlineStore.model.User;
import homeworks.onlineStore.util.StorageSerializeUtil;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class OrderStorage implements Serializable {

    private List<Order> orderList = new LinkedList<>();

    public void add(Order order) {
        orderList.add(order);
        StorageSerializeUtil.serializeOrderStorage(this);
    }

    public void print() {
        for (Order order : orderList) {
            System.out.println(order);
        }
    }

    public Order getById(String id) {
        for (Order order : orderList) {
            if (order.getId().equals(id)) {
                return order;
            }
        }
        return null;
    }

    public void printByUser(User currentUser) {
        for (Order order : orderList) {
            if (currentUser.equals(order.getUser())) {
                System.out.println(order);
            }
        }
    }
}