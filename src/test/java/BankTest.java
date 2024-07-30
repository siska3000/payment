

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import adm.papka_com.Abonent;
import adm.papka_com.Bank;
import adm.papka_com.Transaction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    private Bank bank;

    @BeforeEach
    public void setUp() {
        List<Abonent> abonents = new ArrayList<>();
        abonents.add(new Abonent(1, 1000.0, "Олег"));
        abonents.add(new Abonent(2, 20.0, "Андріан"));
        bank = new Bank(abonents);
    }

    @Test
    public void testGetAbonents() {
        List<Abonent> abonents = bank.getAbonents();
        assertEquals(2, abonents.size());
        assertEquals("Олег", abonents.get(0).getName());
        assertEquals("Андріан", abonents.get(1).getName());
    }

    @Test
    public void testAddTransaction() {
        Transaction transaction = new Transaction(100, new Date(), Transaction.TransactionType.BUY, 1);
        bank.addTransaction(transaction);
        //чи дорівнює
        assertEquals(-100, bank.getBalance());
        assertEquals(1, bank.getTransactions().size());
    }

    @Test
    public void testGetTransactionsByAbonentId() {
        Transaction transaction1 = new Transaction(100, new Date(), Transaction.TransactionType.BUY, 1);
        Transaction transaction2 = new Transaction(200, new Date(), Transaction.TransactionType.SALE, 2);
        bank.addTransaction(transaction1);
        bank.addTransaction(transaction2);

        List<Transaction> transactions = bank.getTransactionsByAbonentId(1);
        assertEquals(1, transactions.size());
        assertEquals(transaction1, transactions.get(0));
    }

    @Test
    public void testGetTransactionsByDate() {
        Date date = new Date();
        Transaction transaction1 = new Transaction(100, date, Transaction.TransactionType.BUY, 1);
        Transaction transaction2 = new Transaction(200, date, Transaction.TransactionType.SALE, 2);
        bank.addTransaction(transaction1);
        bank.addTransaction(transaction2);

        List<Transaction> transactions = bank.getTransactionsByDate(date);
        assertEquals(2, transactions.size());
    }
}
