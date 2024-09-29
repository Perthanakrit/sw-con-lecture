//ธนกฤต ตระกาจัทร์ 661040206060

package interface2.item4;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getKiloDriven() > o2.getKiloDriven()) return 1;
        else if (o1.getKiloDriven() < o2.getKiloDriven()) return -1;
        else return 0;
    }
}
