//ธนกฤต ตระกาจัทร์ 661040206060

package designPattern.strategy.store;

import java.util.List;

public class productQuantityCounter implements Counter  {
    @Override
    public int countProduct(List<Product> products) {
        int count = 0;
        for (Product prod : products) {
            count += prod.getQuantity();
        }
        return count;
    }
}
