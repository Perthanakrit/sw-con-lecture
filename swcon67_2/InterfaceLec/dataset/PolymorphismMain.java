package dataset;

public class PolymorphismMain {
    public static void main(String[] args) {
        BankAccount acc  = new BankAccount(1000);
        BankAccount acc2 = new BankAccount(2000);



    }

    public static void test1(Measurable meas, Measurable meas2, BankAccount acc, BankAccount acc2) {
        //        acc = meas2; This can't. Because of left leatler right
        meas = meas2;
        meas2 = acc2;
        meth(acc);
    }

    public static void meth(Measurable measurable) {
        measurable.getMeasure(); // *Polymorphism
//        measurable.getBalance(); ไม่สามาถเรียนใช้ method ของ class ลูก / class ที้ implement interface นั้น
    }
}
