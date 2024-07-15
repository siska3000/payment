package adm.papka_com;

public class PaymentProcessor {

    public void Buy(Terminal terminal, double amount) {
        
        Transaction transaction = new Transaction(-amount);
        terminal.processTransaction(transaction);
    }

    public void Sale(Terminal terminal, double amount) {

        Transaction transaction = new Transaction(amount);
        terminal.processTransaction(transaction);
    }
}