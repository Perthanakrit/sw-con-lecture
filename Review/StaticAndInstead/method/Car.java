package method;

public class Car extends Vechicle{
    private int speed;

    public Car() {
        System.out.println("Car Constructor");
    }

    public Car(int speed) {
        this.speed = speed;
        System.out.println("Car Constructor & speed: " + speed);
    }

    public static void main(String[] args) {
        Truck.main(args);
        System.out.println(Truck.funcColor());
    }
}
