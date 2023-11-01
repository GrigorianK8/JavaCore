package homeworks.onlineshop.model;

import java.util.Date;
import java.util.Objects;

public class Order {

    private String id;
    private User user;
    private Product product;
    private Date date;
    private double price;
    private int qty;
    private OrderType type;

    public Order(String id, User user, Product product, Date date, double price, int qty, OrderType type) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.date = date;
        this.price = price;
        this.qty = qty;
        this.type = type;
    }

    public Order() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public OrderType getOrderType() {
        return this.type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", product=" + product +
                ", date='" + date + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (Double.compare(price, order.price) != 0) return false;
        if (qty != order.qty) return false;
        if (!Objects.equals(id, order.id)) return false;
        if (!Objects.equals(user, order.user)) return false;
        if (!Objects.equals(product, order.product)) return false;
        if (!Objects.equals(date, order.date)) return false;
        return type == order.type;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + qty;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}