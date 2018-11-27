// BankAccount: holds an account number and a balance;
// Inheritance, every other class inherits (extends) from from this class
public class BankAccount {

	private String accountNo;
	private int balance;

	public BankAccount() {
		accountNo = "default";
		balance = 0;
	}
	
	// get account
	public String getAccountNumber() {
		return accountNo;
	}
	// get balance
	public int getBalance() {
		return balance;
	}

// deposits amount into an account
	public void deposit(float amount) {
		balance += amount;
	}
	// withdraw money, if enough money in account
	public void withdraw(float amount) {
		if (amount > balance) {
			System.out.println("insufficient funds");

		} else {
			balance += amount;
		}
	}
	
	// the bank account details
	public void printDetails() {

		System.out.println(accountNo);
		System.out.println(balance);

	}

}
