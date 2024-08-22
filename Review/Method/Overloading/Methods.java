package Overloading;

public class Methods {
    public static void main(String[] args) {
        Methods m = new Methods();

        m.Action(1.0,2.0f,3.0f);
    }

    private int Action(float a, float b) {
        return (int)(a + b);
    }

    private void Action(double a, double b, double c) {
        System.out.println(a + b + c);
    }

    private void Action(int a, double b, int c) {
        System.out.println(a + b + c);
    }
}
