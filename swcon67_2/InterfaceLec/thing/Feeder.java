package thing;

public class Feeder {

    public static void main(String[] args) {
        Feeder feeder = new Feeder();
        feeder.giveFood(new Bird());
        feeder.giveFood(new Cat());
    }

    public void giveFood(Animal animal) {
        animal.eat();
    }
}
