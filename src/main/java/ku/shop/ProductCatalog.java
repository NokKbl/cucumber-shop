package ku.shop;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {

    private Map<String, Product> products;

    public ProductCatalog() {
        products = new HashMap<>();
    }

    public void addProduct(String name, double price) {
        products.put(name, new Product(name, price));
    }

    public void addProdWithQuan(String name, double price, int quant) {
        products.put(name, new Product(name, price, quant));
    }

    public Product getProduct(String name) {
        return products.get(name);
    }
}
