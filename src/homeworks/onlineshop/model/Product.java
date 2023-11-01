package homeworks.onlineshop.model;

import java.util.Objects;

public class Product extends BasicStructure {

    private String description;
    private double price;
    private int stockQty;
    private ProductType productType;

    public Product(String id, String name, double price, int stockQty, ProductType productType) {
        super(id, name);
        this.description = description;
        this.price = price;
        this.stockQty = stockQty;
        this.productType = productType;
    }

    public Product() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQty() {
        return stockQty;
    }

    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", stockQty=" + stockQty +
                ", productType=" + productType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Product product = (Product) o;

        if (Double.compare(price, product.price) != 0) return false;
        if (stockQty != product.stockQty) return false;
        if (!Objects.equals(description, product.description)) return false;
        return productType == product.productType;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + stockQty;
        result = 31 * result + (productType != null ? productType.hashCode() : 0);
        return result;
    }
}