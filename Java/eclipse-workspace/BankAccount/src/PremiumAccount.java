// PremiumAccount: supports a minimum balance that must be kept in the account
public class PremiumAccount extends BankAccount {

	private float minBalance;

	public PremiumAccount() {
		minBalance = (float) 10.00;
	}

	public float getminBalance() {
		return this.minBalance;
	}

}

