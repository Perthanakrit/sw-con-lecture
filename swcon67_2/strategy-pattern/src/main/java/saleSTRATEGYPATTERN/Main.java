package saleSTRATEGYPATTERN;

public class Main {

    public static void main(String[] args) {
        CashRegister register = new CashRegister(new NYTaxCalculator());

        register.recordPurchase(30);
        register.recordPurchase(70);
        register.calculateTax();

        System.out.println("Total purchase: " + register.getPurchase());

        register.reset();
        register.recordPurchase(180);
        register.recordPurchase(20);
        register.calculateTax();

        System.out.println("Total purchase: " + register.getPurchase());

        // เมื่อใช้ strategy pattern จะช่วยให้
        // สามารถผลัดเปลี่ยน strategy ได้ง่าย
        register.setCalculator(new CATaxCalculator());
        register.reset();
        register.recordPurchase(30);
        register.recordPurchase(70);
        register.calculateTax();

        System.out.println("Total purchase: " + register.getPurchase());
    }
}
