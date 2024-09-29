import dataset.Measurable;

public class BankAccount implements Measurable, Comparable {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > balance) {
            balance = balance + amount;
        }
    }

    @Override
    public double getMeasure() {
        return getBalance();
    }

    @Override
    public int compareTo(Object otherObject) {
        BankAccount other = (BankAccount) otherObject;
        if (this.getBalance() > other.getBalance()) {
            return -1;
        }
        if (this.getBalance() < other.getBalance()) {
            return 1;
        }
        return 0;
    }
}
