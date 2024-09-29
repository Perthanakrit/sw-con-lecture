package saleSTRATEGYPATTERN;

public class CashRegister {
    private double purchase;
    private double payment;

    // composition
    private TaxCalculator calculator;

    public CashRegister(TaxCalculator calculator) {
        this.calculator = calculator;
        reset();
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
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
        purchase = purchase + calculator.calculateTax(purchase);
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
