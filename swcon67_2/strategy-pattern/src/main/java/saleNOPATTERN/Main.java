package saleNOPATTERN;

public class Main {

    public static void main(String[] args) {
        CashRegisterNY register = new CashRegisterNY();

        register.recordPurchase(30);
        register.recordPurchase(70);
        register.calculateTax();

        System.out.println("Total purchase: " + register.getPurchase());

        register.reset();
        register.recordPurchase(180);
        register.recordPurchase(20);
        register.calculateTax();

        System.out.println("Total purchase: " + register.getPurchase());

    }
}
