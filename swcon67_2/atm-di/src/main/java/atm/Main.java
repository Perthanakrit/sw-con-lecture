package atm;

public class Main {
    public static void main(String[] args) {

        DataSource dataSourceFile = new DataSourceFile("customers.txt");
        Bank bank = new Bank("My Bank", dataSourceFile);
        ATM atm = new ATM(bank);
        AtmUI atmUI = new AtmUI(atm);
        atmUI.run();

        DataSource dataSourceDB = new DataSourceDB();
        Bank kuBank = new Bank("My Bank", dataSourceDB);
        ATM kuATM = new ATM(kuBank);
        AtmUI kuATMUI = new AtmUI(kuATM);
        kuATMUI.run();
    }
}
