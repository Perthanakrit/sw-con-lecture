//ธนกฤต ตระกาจัทร์ 661040206060

package interface2.item4;

import java.util.Comparator;

public class CarLicenseComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getLicense().compareTo(o2.getLicense());
    }
}
