package adm.papka_com;

public class Terminal {
    private Bank bank;

    public Terminal(Bank bank2) {
        this.bank = bank2;
    }

    public Bank getBank() {
        return bank;
    }

    public void processTransaction(Transaction transaction) {
        bank.addTransaction(transaction);
    }

    public void setBank(Bank bank3) {
        this.bank = bank3;
    }
}