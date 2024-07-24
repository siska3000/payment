package adm.papka_com;

import java.sql.Date;

public class PaymentProcessor {

    public void Buy(Terminal terminal, int amount, Date date, Integer abonentId) {
        Transaction transaction = new Transaction(amount, date, Transaction.TransactionType.BUY, abonentId);
        terminal.processTransaction(transaction);
    }

    public void Sale(Terminal terminal, int amount, Date date, Integer abonentId) {
        Transaction transaction = new Transaction(amount, date, Transaction.TransactionType.SALE, abonentId);
        terminal.processTransaction(transaction);
    }
}