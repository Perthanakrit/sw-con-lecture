package dataset;

import java.util.Comparator;

public class BalanceComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        BankAccount obj1 = (BankAccount) o1;
        BankAccount obj2 = (BankAccount) o2;

       if (obj1.getBalance() < obj2.getBalance()) return -1;
       if (obj1.getBalance() > obj2.getBalance()) return 1;

        return 0;
    }
}
