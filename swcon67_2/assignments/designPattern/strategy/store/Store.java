//ธนกฤต ตระกาจัทร์ 661040206060

package designPattern.strategy.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;
    public Store() {
        products = new ArrayList<>();
    }
    public void addProduct(String name, double price, int quantity) {
        products.add(new Product(name, price, quantity));
    }

    public int countAllProduct() {
        int count = 0;
        for (Product prod : products) {
            count += 1;
        }
        return count;
    }

    public int countProductInStock() {
        int count = 0;
        for (Product prod : products) {
            if (prod.getQuantity() > 0)
                count += 1;
        }
        return count;
    }

    public int countProductQuantity() {
        int count = 0;
        for (Product prod : products) {
            count += prod.getQuantity();
        }
        return count;
    }

    public List<Product> getProducts() {
        return products;
    }

}
