import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionEx {
    public static void main(String[] args) {
        BankAcc myAcc = new BankAcc(10000.0);

        try {
//            String x = null;
//            x.getBytes();x
            myAcc.withdraw(100.1);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

        DataSource src = new DataSource();

        src.read("number.txt");
    }

    // occurre stackoverflow error
    public static int test(int x) {
        test(x+1);
        return x;
    }
}
