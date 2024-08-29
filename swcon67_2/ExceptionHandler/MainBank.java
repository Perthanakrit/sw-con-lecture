import Exceptions.NotEnoughBalanceException;

public class MainBank {
    public static void main(String[] args) {
        try {
            System.out.println("1, ");
            BankAcc acc = new BankAcc(500);
            acc.withdraw(1000);
            System.out.println("2, ");

            DataSource src = new DataSource();
            src.read("accounts.txt");

        }
        catch (NotEnoughBalanceException e) {
            System.out.println("3, ");
        }
        catch (IllegalArgumentException e) {
            System.out.println("4, "+ e.getMessage());
        }

        System.out.println("4, ");
    }
}
