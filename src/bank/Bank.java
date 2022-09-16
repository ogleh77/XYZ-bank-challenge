package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private String bankName;

	public Bank(String bankName) {
		super();
		this.bankName = bankName;
	}

	private List<Customer> customers=new ArrayList<>();

	public String getBankName() {
		return bankName;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

}
