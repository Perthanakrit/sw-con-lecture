import Exceptions.NotEnoughBalanceException;

public class BankAcc {
    private double balance;

    public BankAcc(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance must not be negative"); // checked expection
        }
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

//    public void withdraw(double amount) throws Exception {
//        if (amount > this.balance) {
//            // checked
//            throw new Exception("Not enough balance");
//        }
//        this.balance -= amount;
//    }

    public void withdraw(double amount) throws NotEnoughBalanceException {
        if (amount > this.balance) {
            throw new NotEnoughBalanceException("Not enough balance"); // checked
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive"); // unchecked
        }

        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAcc{" + "balance=" + this.balance + '}';
    }
}
