package constructor.chaning;

public class Condo extends Residence {
    public double price;
    public double area;
    public int numMember;

    public Condo(int price, double area) {
        this(price, area, 0);
        this.price = price;
        this.area = area;
        System.out.println("Condo1");
    }

    public Condo(int price, double area, int numMember) {
        super("SSK");
        this.price = price;
        this.area = area;
        this.numMember = numMember;
        System.out.println("Condo2");
    }

}
