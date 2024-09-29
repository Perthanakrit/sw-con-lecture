package saleNOTFLEXIBLE;

public class CashRegisterNY extends CashRegister {

    @Override
    public void calculateTax() {
        if (purchase > 100)
            purchase = purchase + (purchase * 0.08);
    }
}
