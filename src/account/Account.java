package account;



import client.Client;

public abstract class Account implements AccountInterface {

	private static final int DEFAULT_AGENCY = 1;
	private static int SEQUENCIAL = 1;

	protected int agency;
	protected int accountNumber;
	protected Client client;
	protected Double balance = 0.0;

	public Account(Client client) {
		this.agency = DEFAULT_AGENCY;
		this.accountNumber = SEQUENCIAL++;
		this.client = client;
	}

	@Override
	public void withDraw(double value) {
		this.balance -= value;

	}

	@Override
	public void deposit(double value) {
		this.balance += value;

	}

	@Override
	public void transfer(double value, Account destinyAccount) {
		withDraw(value);
		destinyAccount.deposit(value);

	}
	protected void printCommonValues(){
		
		System.out.println(String.format("Holder: %s", client.getName()));
		System.out.println(String.format("Account number: %d", this.accountNumber));
		System.out.println(String.format("Agency: %d", this.agency));
		System.out.println(String.format("Balance: %.2f", this.balance));
	}
}
