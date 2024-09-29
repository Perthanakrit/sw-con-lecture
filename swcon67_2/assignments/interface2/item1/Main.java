//ธนกฤต ตระกาจัทร์ 661040206060

package interface2.item1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Thing> products = new ArrayList<>();
        products.add(new Product("chicken", 59.99));
        products.add(new Product("peanut butter", 110.23));

        ArrayList<Thing> cars = new ArrayList<>();
        cars.add(new Car("nato", 1345.14));
        cars.add(new Car("suv", 2024.90));

        System.out.println("Max product price: " + StatUtil.max(products));
        System.out.println("Max car price: " + StatUtil.max(cars));
    }
}
