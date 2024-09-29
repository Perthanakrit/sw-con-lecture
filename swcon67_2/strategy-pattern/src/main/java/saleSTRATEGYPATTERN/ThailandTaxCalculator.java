package saleSTRATEGYPATTERN;

public class ThailandTaxCalculator implements TaxCalculator {

    public double calculateTax(double amount) {
        return amount * 0.07;
    }
}
