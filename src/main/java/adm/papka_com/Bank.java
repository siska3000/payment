package adm.papka_com;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Transaction> transactions;
    private double balance;

    public Bank() {
        this.transactions = new ArrayList<>();
        this.balance = 0.0;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public double getBalance() {
        return balance;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        balance += transaction.getAmount();
    }
}