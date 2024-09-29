//ธนกฤต ตระกาจัทร์ 661040206060

package interface2.item3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("chicken", 59.99),
            new Product("peanut butter", 110.23),
            new Product("chicken", 69.99)
        };

        Car[] cars = {
                new Car("suv", 2124.90),
                new Car("nato", 1345.14),
                new Car("suv", 2024.90),
        };

        sort(products);
        sort(cars);

        for (Product p : products) {
            System.out.println(p);
        }

        System.out.println("------");

        for (Car c : cars) {
            System.out.println(c);
        }

    }

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[minPos]) < 0) {
                    minPos = j;
                }
            }

            Comparable temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }
}
