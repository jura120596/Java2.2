package com.company;

public interface BankInterface {
    public boolean transaction(float sum,
               Client clientFrom, Client ClientTo);
    public void registration(Client client) throws Exception;
}
