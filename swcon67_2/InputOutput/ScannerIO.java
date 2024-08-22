import java.io.File;
import java.util.Scanner;

public class ScannerIO {
    public static void main(String[] args) {
        File file = new File("files/dataSpace.txt");

        Scanner scanner = null;


        String a = scanner.next();
        int b = scanner.nextInt();
        double c = scanner.nextDouble();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
