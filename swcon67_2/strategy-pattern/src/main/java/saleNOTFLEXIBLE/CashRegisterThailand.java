package saleNOTFLEXIBLE;

public class CashRegisterThailand extends CashRegister {

    @Override
    public void calculateTax() {
        purchase = purchase + (purchase * 0.07);
    }
}
