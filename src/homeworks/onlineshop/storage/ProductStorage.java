package homeworks.onlineshop.storage;

import homeworks.onlineshop.exception.NotFoundException;
import homeworks.onlineshop.model.Product;
import homeworks.onlineshop.model.User;

public class ProductStorage {

    private Product[] products = new Product[10];
    private int size;

    public void printProducts() {
        if (size == 0) {
            System.out.println("No products found!");
            return;
        }
        for (int i = 0; i < size; i++) {
            Product product = products[i];
            System.out.println("Products --------------------");
            System.out.println("Product ID: " + product.getId());
            System.out.println("Product Name: " + product.getName());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Stock Quantity: " + product.getStockQty());
            System.out.println("Product Type: " + product.getProductType());
            System.out.println("-----------------------------");
        }
    }

    public void addProduct(Product product) {
        if (size == products.length) {
            extend();
        }
        products[size++] = product;
    }

    public void removeProductById(String productId) throws NotFoundException {
        int indexToRemove = -1;
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(productId)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            removeProductByIndex(indexToRemove);
        } else {
            throw new NotFoundException("Product with ID " + productId + " not found.");
        }
    }

    public Product getProductById(String productId) throws NotFoundException {
        for (int i = 0; i < size; i++) {
            Product product = products[i];
            if (product.getId().equals(productId)) {
                return (Product) product;
            }
        }
        throw new NotFoundException("Product with " + productId + "does not found");
    }

    private void removeProductByIndex(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                products[i] = products[i + 1];
            }
            products[size - 1] = null;
            size--;
        }
    }

    private void extend() {
        Product[] tmp = new Product[products.length + 10];
        System.arraycopy(products, 0, tmp, 0, products.length);
        products = tmp;
    }
}