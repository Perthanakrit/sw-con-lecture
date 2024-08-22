package SuperThis;

public class Car extends Vechicle {
    private int speed;
    public Car() {
        super(2.89);
        System.out.println("Car Constructor");
    }

    public Car(int speed) {
        super(3.01);
        this.speed = speed;
        System.out.println("Car Constructor & speed: " + speed);
    }

    public static void main(String[] args) {
        Truck.main(args);
        System.out.println(Truck.funcColor());
    }
}
