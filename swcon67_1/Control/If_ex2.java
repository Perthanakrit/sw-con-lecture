import java.util.Scanner;

public class If_ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantity: ");
        int num = in.nextInt();
        int toTalPrice = 0;
        
        toTalPrice = num * 100;

        if (toTalPrice >= 1000) {
            toTalPrice = toTalPrice - (toTalPrice * 10 / 100);
        }

        System.out.println("Total price: " + toTalPrice);
    }
}