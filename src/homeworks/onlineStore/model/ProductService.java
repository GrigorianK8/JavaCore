package homeworks.onlineStore.model;

import homeworks.onlineStore.exception.OutOfStockException;
import homeworks.onlineStore.model.Product;

public class ProductService {

    public static void validateStockAvailability(Product product, int requestedQty) throws OutOfStockException {
        if (product.getStockQty() < requestedQty) {
            throw new OutOfStockException("Not enough stock available for product: " + product.getName());
        }
    }
}