package main;

import account.Account;
import account.CurrentAccount;
import account.Savings;
import bank.Bank;
import client.Client;

public class Main {

	public static void main(String[] args) {
		Bank clientBank = Client.getBank();
		Client client1 = new Client("Client number 1", 22);
		Client client2 = new Client ("Client number 2", 20);
		Account cc = new CurrentAccount(client1);
		Account cp = new Savings(client2);
		cc.deposit(100);
		cp.deposit(100);
		cc.printStatement();
		cp.printStatement();
		cc.transfer(150, cp);
		
		cc.printStatement();
		cp.printStatement();
		clientBank.printClientList();

	}

}
