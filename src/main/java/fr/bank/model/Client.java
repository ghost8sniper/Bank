package fr.bank.model;

public class Client {

    private String firstname;
    private String lastname;
    private Account account;

    public Client(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        account = new AccountImpl();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
