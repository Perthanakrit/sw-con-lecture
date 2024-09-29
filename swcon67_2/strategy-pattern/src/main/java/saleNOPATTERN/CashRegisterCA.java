package saleNOPATTERN;

public class CashRegisterCA {
    private double purchase;
    private double payment;

    public CashRegisterCA() {
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
        purchase = purchase + (purchase * 0.075);
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
