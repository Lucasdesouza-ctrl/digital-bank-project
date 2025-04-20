package account;

import client.Client;

public class Savings extends Account{
	public Savings(Client client) {
		super(client);
		
	}

	public void printStatement() {
		System.out.println("========= Savings ========");
		super.printCommonValues();
	}
}
