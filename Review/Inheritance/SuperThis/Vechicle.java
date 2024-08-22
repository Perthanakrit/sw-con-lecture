package SuperThis;



public abstract class Vechicle {
    protected double size;

    Vechicle(double size) {
        this.size = size;
        System.out.println("Vechicle created");
    }

    protected void LevelUp() {
        System.out.println("Vechicle Level Up");
    }

    protected void LevelDown(int n) {
        System.out.println("Vechicle Level Down " + n);
    }
}
