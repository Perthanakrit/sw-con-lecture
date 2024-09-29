//ธนกฤต ตระกาจัทร์ 661040206060

package interface2.item2;

import java.util.ArrayList;

class StatUtilResult {
    private double carResult;
    private double productResult;

    public StatUtilResult(double carResult, double productResult) {
        this.carResult = carResult;
        this.productResult = productResult;
    }

    public double getCarResult() {
        return carResult;
    }

    public double getProductResult() {
        return productResult;
    }
}

public class StatUtil {
    public static StatUtilResult max(ArrayList<Car> cars, ArrayList<Product> products) {
        double maxCar = 0;
        double maxProduct = 0;

        for (Car car: cars) {
            if (car.getKiloDriven() > maxCar) {
                maxCar = car.getKiloDriven();
            }
        }

        for (Product product: products) {
            if (product.getPrice() > maxProduct) {
                maxProduct = product.getPrice();
            }
        }

        return new StatUtilResult(maxCar, maxProduct);
    }

}
