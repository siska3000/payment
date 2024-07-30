

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import adm.papka_com.Abonent;
import adm.papka_com.Bank;
import adm.papka_com.PaymentProcessor;
import adm.papka_com.Terminal;
import adm.papka_com.Transaction;

public class Main {

    public static void main(String[] args) {
        List<Abonent> abonents = new ArrayList<>();
        abonents.add(new Abonent(1, 1000.0, "Олег"));
        abonents.add(new Abonent(2, 2000.0, "Андріан"));

        Bank bank = new Bank(abonents);

        Terminal terminal = new Terminal(bank);

        PaymentProcessor processor = new PaymentProcessor();

        Date now = new Date();
        processor.Buy(terminal, 100, now, 1);
        processor.Buy(terminal, 200, now, 2);

        processor.Sale(terminal, 150, now, 1);

        System.out.println("Bank Balance: " + bank.getBalance());

        System.out.println("Transactions for Abonent 1:");
        List<Transaction> transactionsForAbonent1 = bank.getTransactionsByAbonentId(1);
        transactionsForAbonent1.stream()
            .forEach(System.out::println);

        System.out.println("Transactions for Abonent 2:");
        List<Transaction> transactionsForAbonent2 = bank.getTransactionsByAbonentId(2);
        transactionsForAbonent2.stream()
            .forEach(System.out::println);
    }
}
