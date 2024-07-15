package adm.papka_com;


public class Transaction {
    private double amount;

    public Transaction(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Транзакція{" +
                "Сума=" + amount +
                '}';
    }
}