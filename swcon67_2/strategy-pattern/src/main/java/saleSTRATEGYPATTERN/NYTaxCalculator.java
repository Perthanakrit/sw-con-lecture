package saleSTRATEGYPATTERN;

public class NYTaxCalculator implements TaxCalculator {

    public double calculateTax(double amount) {
        if (amount <= 100)
            return 0;
        return amount * 0.08;
    }
}
