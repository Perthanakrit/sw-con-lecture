package method;

import finalAndStatic.StClass;

public class Vechicle extends StClass {
    protected double size;

    public static void main(String[] args) {
        Vechicle vechicle = new Vechicle();
        vechicle.runTo();
    }

    @Override
    public void runTo() {
        super.runTo();
        System.out.println("Vechicle runTo");
    }
}
