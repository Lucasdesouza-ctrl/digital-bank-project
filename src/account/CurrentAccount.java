package account;

import client.Client;

public class CurrentAccount extends Account {
	protected double specialCheck = 100;
	
	
	public CurrentAccount(Client client) {
		super(client);
		this.balance += specialCheck;
	}

	
	@Override
	public void printStatement() {
		
		System.out.println("========= Current Account ========");
		super.printCommonValues();
		if(this.balance < 100) {
			System.out.println("Cauntion ! You are using special check.");
		}
	}
	
	
}
