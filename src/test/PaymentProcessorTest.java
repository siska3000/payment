package com.test.objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import adm.papka_com.Bank;
import adm.papka_com.PaymentProcessor;
import adm.papka_com.Terminal;
import adm.papka_com.Transaction;

import java.util.ArrayList;
import java.util.Date;

public class PaymentProcessorTest {

    private PaymentProcessor processor;
    private Terminal terminal;
    private Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank(new ArrayList<>());
        terminal = new Terminal(bank);
        processor = new PaymentProcessor();
    }

    @Test
    public void testBuy() {
        Date date = new Date();
        processor.Buy(terminal, 100, date, 1);

        ArgumentCaptor<Transaction> captor = ArgumentCaptor.forClass(Transaction.class);
        verify(terminal, times(1)).processTransaction(captor.capture());
        Transaction transaction = captor.getValue();

        assertEquals(100, transaction.getAmount());
        assertEquals(Transaction.TransactionType.BUY, transaction.getType());
        assertEquals(1, transaction.getAbonentId());
    }

    @Test
    public void testSale() {
        Date date = new Date();
        processor.Sale(terminal, 200, date, 2);
        //захоплювати аргумент
        
        ArgumentCaptor<Transaction> captor = ArgumentCaptor.forClass(Transaction.class);
        verify(terminal, times(1)).processTransaction(captor.capture());
        Transaction transaction = captor.getValue();

        assertEquals(200, transaction.getAmount());
        assertEquals(Transaction.TransactionType.SALE, transaction.getType());
        assertEquals(2, transaction.getAbonentId());
    }
}
