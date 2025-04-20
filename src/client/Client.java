package client;

import bank.Bank;

public class Client {
	protected String name;
	protected int age;
	private static Bank bank;
	static {
		
		Client.bank = new Bank(); 
	}

	public Client(String name, int age) {
		this.name = name;
		this.age = age;
		Client.bank.addClient(name);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public static Bank getBank() {
		return bank;
	}


	

}
