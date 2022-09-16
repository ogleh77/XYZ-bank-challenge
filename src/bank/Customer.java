package bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	// Magaca macmiilka
	private String costumerName;

	// Tirada accounda uu leyahay macmiilku
	private List<Account> accounts = new ArrayList<>();

	public Customer(String costumerName) {
		super();
		this.costumerName = costumerName;
	}

	public String getCostumerName() {
		return costumerName;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public double total() {
		double sum = 0;

		for (int i = 0; i < accounts.size(); i++) {
			sum += accounts.get(i).getAmount();

		}
		return sum;
	}

	@Override
	public String toString() {
		return "Customer [costumerName=" + costumerName + ", accounts=" + accounts + "]";
	}

}
