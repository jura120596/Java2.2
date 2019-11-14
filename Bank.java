package com.company;

public class Bank implements BankInterface{
    private BankClient[] clients = new BankClient[2];
    public static int clientsCount = 0;
    private String name;
    public Bank(String name) throws Exception {
        this.setName(name);
    }
    @Override
    public boolean transaction(float sum,
           Client clientFrom, Client ClientTo) {
        return false;
    }

    @Override
    public void registration(Client client)
            throws Exception {
        this.clients[clientsCount] =
                new BankClient(client);
        clientsCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
            throws Exception {
        if (name.length() == 0) {
            throw new Exception("Empty bank name");
        }
        this.name = name;
    }
}
