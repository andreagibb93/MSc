//KidsAccount: supports a bonus each time a deposit is made

public class KidsAccount extends BankAccount {

	private float bonus;

	public KidsAccount() {
		bonus = (float) 10.00;
	}

	// adds a bonus when deposit is made
	public void addBonus() {
		super.deposit(getBalance() + bonus);
	}

}
