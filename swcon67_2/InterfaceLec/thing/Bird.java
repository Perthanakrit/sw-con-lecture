package thing;

public class Bird implements Flyable, Animal{
    private String name;
    private String type;

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }

    @Override
    public void eat() {
        System.out.println("Bird eat");
    }
}
