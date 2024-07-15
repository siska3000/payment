package adm.papka_com;

public class App {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Terminal terminal = new Terminal(bank);
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.Buy(terminal, 100.0);
        paymentProcessor.Sale(terminal, 59.3);
        paymentProcessor.Buy(terminal, 212.0);
        paymentProcessor.Sale(terminal, 150.0);
        paymentProcessor.Buy(terminal, 300.0);

        System.out.println("Транзакції:");
        for (Transaction transaction : bank.getTransactions()) {
            System.out.println(transaction);
        }

        System.out.println("Наявний баланс: " + bank.getBalance());
    }
}