package adm.papka_com;

import java.util.Date;

public class Transaction {
    private int amount;
    private Date timeDate;
    private final TransactionType type;
    private int abonentId;

    public Transaction(int amount, Date timeDate, TransactionType type, int abonentId) {
        this.amount = amount;
        this.timeDate = timeDate;
        this.type = type;
        this.abonentId = abonentId;
    }

    public int getAbonentId() {
        return abonentId;
    }

    public void setAbonentId(int abonentId) {
        this.abonentId = abonentId;
    }

    public enum TransactionType {
        BUY, SALE
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getTimedate() {
        return timeDate;
    }

    public void setTimedate(Date timedate) {
        this.timeDate = timedate;
    }

    public TransactionType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Transaction [amount=" + amount + ", timeDate=" + timeDate + ", type=" + type + ", abonentId="
                + abonentId + "]";
    }

    
}
