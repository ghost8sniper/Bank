package fr.bank.model;

import java.util.Date;

public class Transaction {

    private static long idGenerator;

    private final Long id;
    private OperationType operationType;
    private Date date;
    private Long amount;
    private Long newBalance;

    public Transaction() {
        id = ++idGenerator;
    }

    public Transaction(OperationType operationType, Date date, Long amount, Long newBalance) {
        id = ++idGenerator;
        this.operationType = operationType;
        this.date = date;
        this.amount = amount;
        this.newBalance = newBalance;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(Long newBalance) {
        this.newBalance = newBalance;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", operationType=" + operationType +
                ", date=" + date +
                ", amount=" + amount +
                ", newBalance=" + newBalance +
                '}';
    }
}
