package saleNOTFLEXIBLE;

public class Main {
    public static void main(String[] args) {
        CashRegister register = new CashRegisterNY();
        register.recordPurchase(30);
        register.recordPurchase(70);
        register.calculateTax();

        System.out.println("Total purchase: " + register.getPurchase());

        // การใช้ inheritance จะ
        // ไม่สามารถผลัดเปลี่ยน strategy ได้ง่าย

    }
}
