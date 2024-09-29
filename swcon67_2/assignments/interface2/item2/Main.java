//ธนกฤต ตระกาจัทร์ 661040206060

package interface2.item2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("chicken", 59.99));
        products.add(new Product("peanut butter", 110.23));

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("nato", 1345.14));
        cars.add(new Car("suv", 2024.90));

        StatUtilResult result = StatUtil.max(cars, products);

        System.out.println("Max product price: " + result.getProductResult());
        System.out.println("Max car price: " + result.getCarResult());
    }
}
