package Overloading;

public class OverMethods {
    public static void main(String[] args) {
        short a =1, b=2, c=3;
        OverMethods.method(a, b);
    }

    public static void method(double a, double b) {
        System.out.println("Double "+a + " " + b);
    }

    public static void method(float a, float b) {
        System.out.println("Float " + a + " " + b);
    }
}
