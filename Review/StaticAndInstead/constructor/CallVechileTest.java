package constructor;

import method.Car;
import method.Truck;

public class CallVechileTest {
    public static void main(String[] args) {
        Truck.main(args);
        Car.main(args);
        Car car = new Car();
    }
}
