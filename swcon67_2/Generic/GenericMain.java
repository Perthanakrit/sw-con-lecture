import dataset.BankAccount;
import dataset.Country;
import dataset.Dataset;

public class GenericMain {
    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount(500);
        BankAccount ac2 = new BankAccount(500);
        Country thailand = new Country("Thailand", 65, 513, 23);
        Country singapore = new Country("Singapore", 65, 513, 23);

//        Country[] objects = {ac1, ac2, thailand, singapore};
//        Dataset dataSet = new Dataset();
//        double avg = dataSet.average(objects, new AreaMeasurer());
    }
}
