package adm.papka_com;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bank {
    private List<Transaction> transactions;
    private int balance;
    private List<Abonent> abonents;

    public void setAbonents(List<Abonent> abonents) {
        this.abonents = abonents;
    }

    public List<Abonent> getAbonents() {
        return abonents;
    }

    public Bank(List<Abonent> abonents) {
        this.transactions = new ArrayList<>();
        this.balance = 0;
        this.abonents = abonents;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public int getBalance() {
        return balance;
    }


    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        updateBalance(transaction);
        
    }

    private void updateBalance(Transaction transaction) {
        switch (transaction.getType()) {
            case BUY:
                balance -= transaction.getAmount(); 
                break;
            case SALE:
                balance += transaction.getAmount(); 
                break;
        }
    }

    public List<Transaction> getTransactionsByAbonentId(int abonentId) {
        return transactions.stream()
                .filter(transaction -> transaction.getAbonentId() == abonentId)
                .collect(Collectors.toList());
    }

    @SuppressWarnings("deprecation")
    private boolean isSameDay(Date date, Date date2) {
        return date.getYear() == date2.getYear() &&
               date.getMonth() == date2.getMonth() &&
               date.getDate() == date2.getDate();
    }

    public List<Transaction> getTransactionsByDate(Date date) {
        return transactions.stream()
                .filter(transaction -> isSameDay(transaction.getTimedate(), date))
                .collect(Collectors.toList());
    }





}
