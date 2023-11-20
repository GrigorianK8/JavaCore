package homeworks.onlineStore.storage;

import homeworks.onlineStore.model.Product;
import homeworks.onlineStore.util.StorageSerializeUtil;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class ProductStorage implements Serializable {

    private Set<Product> productSet = new HashSet<>();

    public void add(Product product) {
        productSet.add(product);
        StorageSerializeUtil.serializeProductStorage(this);
    }

    public void print() {
        for (Product product : productSet) {
            if (!product.isRemoved())
                System.out.println(product);
        }
    }

    public Product getById(String id) {
        for (Product product : productSet) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}