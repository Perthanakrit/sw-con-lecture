package SuperThis;

public class Truck extends Vechicle {
    private int numWheel;
    private int numSeat;
    private String color;
    private double speed;

    Truck() {
        //super(1.0);
        this(4, 2);
    }

    Truck(int numWheel, int numSeat) {
        super(1.0);
        this.numWheel = numWheel;
        this.numSeat = numSeat;
    }

    public static void main(String[] args) {
        String s = funcColor();
        System.out.println("My Truck color is "+s);

        Truck t = new Truck();
        t.color = "blue";
        System.out.println(t.getColor());

        Truck truck = new Truck();
        truck.LevelDown(2);
    }

    static String funcColor() {
        return "My car Truck is red";
    }

    public String getColor() {
        this.LevelUp();
        return color;
    }
    protected void LevelUp() {
        super.LevelUp();
        System.out.println("Truck Level Up" );
    }

    protected void LevelUp(int n) {
        super.LevelUp();
        System.out.println("Truck Level Up "+n );
    }

    @Override
    protected void LevelDown(int d) {
        System.out.println(d);
    }
}
