package method;

public class Truck extends Vechicle {
    private int numWheel;
    private int numSeat;
    private String color;
    private double speed;
    public static void main(String[] args) {
        String s = funcColor();
        System.out.println("My Truck color is "+s);

        Truck t = new Truck();
        t.color = "blue";
        System.out.println(t.getColor());
    }

    static String funcColor() {
        return "My car Truck is red";
    }

    public String getColor() {
        return color;
    }
}
