package homeworks.onlineStore.storage;

import homeworks.onlineStore.model.Product;
import homeworks.onlineStore.util.StorageSerializeUtil;

import java.io.Serializable;

public class ProductStorage implements Serializable {

    private Product[] products = new Product[10];
    private int size;

    public void add(Product product) {
        if (products.length == size) {
            extend();
        }
        products[size++] = product;
        StorageSerializeUtil.serializeProductStorage(this);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            if (!products[i].isRemoved()) {
                System.out.println(products[i]);
            }
        }
    }

    public Product getById(String id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(id)) {
                return products[i];
            }
        }
        return null;
    }

    private void extend() {
        Product[] tmp = new Product[products.length + 10];
        System.arraycopy(products, 0, tmp, 0, products.length);
        products = tmp;
    }
}