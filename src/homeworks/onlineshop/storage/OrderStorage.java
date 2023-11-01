package homeworks.onlineshop.storage;

import homeworks.onlineshop.exception.NotFoundException;
import homeworks.onlineshop.model.Order;
import homeworks.onlineshop.model.Product;
import homeworks.onlineshop.model.User;

public class OrderStorage {

    private Order[] orders = new Order[10];
    private int size;

    public void addOrder(Order order) {
        if (size == orders.length) {
            extend();
        }
        orders[size++] = order;
    }

    public void printOrders() {
        if (size == 0) {
            System.out.println("No orders found!");
            return;
        }
        for (int i = 0; i < size; i++) {
            Order order = orders[i];
            System.out.println("All Orders --------------------");
            System.out.println("Order ID: " + order.getId());
            System.out.println("User: " + order.getUser().getName());
            System.out.println("Product: " + order.getProduct().getName());
            System.out.println("Quantity: " + order.getQty());
            System.out.println("Order Status: " + order.getOrderType());
            System.out.println("---------------------------");
        }
    }

    public Order getOrderById(String orderId) throws NotFoundException {
        for (int i = 0; i < size; i++) {
            Order order = orders[i];
            if (order.getId().equals(orderId)) {
                return (Order) order;
            }
        }
        throw new NotFoundException("Order with " + orderId + " does not found");
    }

    public void printOrdersByUser(User user) {
        System.out.println("Orders for user: " + user.getName());
        for (int i = 0; i < size; i++) {
            Order order = orders[i];
            if (order.getUser().equals(user)) {
                System.out.println(order);
            }
        }
    }

    public void removeOrderById(String orderId) throws NotFoundException {
        int indexToRemove = -1;
        for (int i = 0; i < size; i++) {
            if (orders[i].getId().equals(orderId)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < size - 1; i++) {
                orders[i] = orders[i + 1];
            }
            orders[size - 1] = null;
            size--;
        } else {
            throw new NotFoundException("Order with ID " + orderId + " not found.");
        }
    }

    private void extend() {
        Order[] tmp = new Order[orders.length + 10];
        System.arraycopy(orders, 0, tmp, 0, orders.length);
        orders = tmp;
    }
}