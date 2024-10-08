//ธนกฤต ตระกาจัทร์ 661040206060

package interface2.item4;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()) return 1;
        else if (o1.getPrice() < o2.getPrice()) return -1;
        else return 0;
    }
}
