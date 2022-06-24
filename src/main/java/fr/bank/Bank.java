package fr.bank;

import fr.bank.model.Client;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Client> clients;

    public Bank() {
        clients = new ArrayList<>();
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client1 = new Client("Youness", "OUFRID");
        client1.getAccount().deposit(1000L);
        client1.getAccount().deposit(5000L);
        client1.getAccount().deposit(5000L);

        Client client2 = new Client("John", "JOHN");
        client2.getAccount().deposit(200L);
        client2.getAccount().deposit(8000L);
        client2.getAccount().deposit(6500L);

        bank.getClients().add(client1);
        bank.getClients().add(client2);

        client1.getAccount().printHistory();
        client2.getAccount().printHistory();
    }
}
