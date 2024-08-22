package finalAndStatic;

public class StClass {
    public static int a;
    public final float b = 2;

    public static void main(String[] args) {
        a = 1;

        System.out.println("main StClass" + " "+ a);
    }

    public static void run()
    {
        final double num;
        num = 1;
        System.out.println(num);
    }

    public void runTo(){
        System.out.println("Hello World runTo");
    }
}
