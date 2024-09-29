package dataset;

public class WrongTypeMain {
    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount(500);
        BankAccount ac2 = new BankAccount(500);
        Country thailand = new Country("Thailand", 65, 513, 23);
        Country singapore = new Country("Singapore", 65, 513, 23);

        Object[] objects = {ac1, ac2, thailand, singapore};
        Dataset dataSet = new Dataset();
//        double avg = dataSet.average(objects, new AreaMeasurer());
    }
}
