package bank;

public class Account {
	private String accountNumber;
	// xadiga xisabta ugu jirta accountka
	private double amount;

	public Account(String accountNum, double amount) {
		this.accountNumber = accountNum;
		this.amount = amount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", amount=" + amount + "]";
	}

	
	
	
}
