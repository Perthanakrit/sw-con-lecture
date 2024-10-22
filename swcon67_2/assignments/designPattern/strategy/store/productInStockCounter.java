//ธนกฤต ตระกาจัทร์ 661040206060

package designPattern.strategy.store;

import java.util.List;

public class productInStockCounter implements Counter {
    @Override
    public int countProduct(List<Product> products) {
        int count = 0;
        for (Product product : products) {
            if (product.getQuantity() > 0) {
                count += 1;
            }
        }

        return count;
    }
}
