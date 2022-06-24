package fr.bank.model;

import fr.bank.exception.InvalidAmountException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountImpl implements Account {

    private Long balance;
    private List<Transaction> transactions;

    public AccountImpl() {
        balance = 0L;
        transactions = new ArrayList<>();
    }

    @Override
    public synchronized Long deposit(Long amount) {
        if(amount.compareTo(0L) > 0){
            balance += amount;
            transactions.add(new Transaction(OperationType.DEPOSIT, new Date(), amount, balance));
        }
        else
            throw new InvalidAmountException("The deposit amount must be greater than 0");
        return balance;
    }

    @Override
    public synchronized boolean withdraw(Long amount) {
        if(amount.compareTo(0L) > 0 && balance.compareTo(amount) >= 0){
            balance -= amount;
            transactions.add(new Transaction(OperationType.WITHDRAW, new Date(), amount, balance));
            return true;
        }
        else
            throw new InvalidAmountException("The withdrawal amount must be greater than 0 and less than or equal to the balance");
    }

    @Override
    public void printHistory() {
        transactions.forEach(System.out::println);
    }

    @Override
    public Long getBalance() {
        return balance;
    }

}
