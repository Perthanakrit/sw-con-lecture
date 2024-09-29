package saleNOTFLEXIBLE;

public abstract class CashRegister {
    protected double purchase;
    protected double payment;

    public CashRegister() {
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

    abstract public void calculateTax();

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
