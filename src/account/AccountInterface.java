package account;

public interface AccountInterface {
	void withDraw(double value);
	void deposit(double value);
	void transfer(double value, Account destinyAccount);
	void printStatement();
	
}
