package adm.papka_com;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Abonent abonent1 = new Abonent(1, 1000.0, "Oleh");
        Abonent abonent2 = new Abonent(2, 500.0, "andrian");
        
        List<Abonent> abonents = new ArrayList<>();
        abonents.add(abonent1);
        abonents.add(abonent2);

        Bank bank = new Bank(abonents);
        Terminal terminal = new Terminal(bank);
        PaymentProcessor processor = new PaymentProcessor();

        Date date1 = new Date(getMillis(10, 12, 2024));
        Date date2 = new Date(getMillis(16, 11, 2024));


        processor.Buy(terminal, 200, date1, 1);
        processor.Sale(terminal, 100, date2, 2);
        processor.Sale(terminal, 50, date1, 1);

        bank.getTransactionsByAbonentId(1).stream()
            .forEach(System.out::println);

        bank.getTransactionsByDate(date1).stream()
            .forEach(System.out::println);




        // System.out.println("Транзакції:");

        // bank.getTransactions().stream()
        // .filter(App::ifpair)
        // .forEach(System.out::println);

        // System.out.println("Наявний баланс: " + bank.getBalance());


        bank.getTransactions().stream()
        .map(trs -> trs.getAmount())
        .filter(am -> am % 2 == 0);
        
        // .forEach(System.out::println);

    

        int nNumbers = bank.getTransactions().stream()
        .mapToInt(trs -> trs.getAmount())
        .filter(amount -> amount < 0)
        .sum();

        int pNumbers = bank.getTransactions().stream()
        .mapToInt(trs -> trs.getAmount())
        .filter(amount -> amount > 0)
        .sum();

        System.out.println("Positive " + pNumbers + " Negative " + nNumbers);
 
     
    }

    public static boolean ifpair(Transaction trs) {
        return trs.getAmount() % 2 == 0;

    }
    //лонг для мілісекунд
    private static long getMillis(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month - 1); 
        calendar.set(Calendar.YEAR, year);
        return calendar.getTimeInMillis();
    }
}   
