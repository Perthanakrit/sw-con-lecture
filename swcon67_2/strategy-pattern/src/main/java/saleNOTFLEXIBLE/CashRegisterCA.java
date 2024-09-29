package saleNOTFLEXIBLE;

public class CashRegisterCA extends CashRegister {

    @Override
    public void calculateTax() {
        purchase = purchase + (purchase * 0.075);
    }
}
