package fr.bank.model;

public interface Account {

    Long deposit(Long amount);
    boolean withdraw(Long amount);

    Long getBalance();

    void printHistory();
}
