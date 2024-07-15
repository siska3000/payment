package adm.papka_com;

public class Terminal {
    private Bank bank;

    public Terminal(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }

    public void processTransaction(Transaction transaction) {
        bank.addTransaction(transaction);
    }
}