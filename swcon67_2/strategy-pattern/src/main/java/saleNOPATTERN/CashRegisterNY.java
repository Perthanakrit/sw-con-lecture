package saleNOPATTERN;

public class CashRegisterNY {
    private double purchase;
    private double payment;

    public CashRegisterNY() {
        reset();
    }

    public double getPurchase() {
        return purchase;
    }

    public double getPayment() {
        return payment;
    }

    public void recordPurchase(double price) {
        purchase += price;
    }

    public void calculateTax() {
        if (purchase > 100)
            purchase = purchase + (purchase * 0.08);
    }

    public void enterPayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        return payment - purchase;
    }

    public void reset() {
        purchase = 0;
        payment = 0;
    }
}
