//ธนกฤต ตระกาจัทร์ 661040206060

package interface2.item4;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("chicken", 59.99),
            new Product("peanut butter", 110.23),
            new Product("bread", 99.99)
        };

        Car[] cars = {
                new Car("suv", 2124.90),
                new Car("nato", 1345.14),
                new Car("aws", 2024.90),
        };

        System.out.println("---Product---");

        sort(products, new ProductNameComparator());
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("---");
        sort(products,new ProductPriceComparator());
        for (Product p : products) {
            System.out.println(p);
        }

        System.out.println("---Car---");

        sort(cars, new CarLicenseComparator());
        for (Car c : cars) {
            System.out.println(c);
        }

        System.out.println("---");

        sort(cars, new CarPriceComparator());
        for (Car c : cars) {
            System.out.println(c);
        }

    }

    public static void sort(Object[] a, Comparator c) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (c.compare(a[j], a[minPos]) < 0) {
                    minPos = j;
                }
            }

            Object temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }
}
