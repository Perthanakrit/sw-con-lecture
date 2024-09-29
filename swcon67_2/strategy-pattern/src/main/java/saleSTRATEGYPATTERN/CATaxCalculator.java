package saleSTRATEGYPATTERN;

public class CATaxCalculator implements TaxCalculator {

    public double calculateTax(double amount) {
        return amount * 0.075;
    }
}
