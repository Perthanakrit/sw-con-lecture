public class BalanceMeasurer implements Measurer<BankAccount>{
    @Override
    public double measure(BankAccount bankAccount) {
        return bankAccount.getMeasure();
    }
}
