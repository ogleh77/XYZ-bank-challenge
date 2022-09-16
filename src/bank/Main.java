package bank;

import java.util.Iterator;
import java.util.List;

public class Main {

	private static Bank bank;

	public static void main(String a[]) {

		Customer customer1 = new Customer("Mohamed ogleh");

		// accounada macmiilka 1aad
		Account account1 = new Account("4567892", 500);
		Account account2 = new Account("4636462", 10.00);
		Account account3 = new Account("5345656", 1500);

		// tirada accounts ka uu leyhay macmiilka kobaaad
		customer1.getAccounts().addAll(List.of(account1, account2, account3));

		Customer customer2 = new Customer("Jamac Muuse");

		Account account4 = new Account("4567892", 600);
		Account account5 = new Account("4636462", 70.00);
		Account account6 = new Account("5345656", 2500);

		// tirada accounts ka uu leyhay macmiilka labaad
		customer2.getAccounts().addAll(List.of(account4, account5, account6));

		bank = new Bank("XYZ BANK");

		bank.getCustomers().add(customer1);
		bank.getCustomers().add(customer2);

		System.out.println("Hiest demand costumer is "+getHiestDemand());
		
		
		
		
	}

	// Soo saar kostumrka ugu lacgta bdn banka

	public static Customer getHiestDemand() {

		Customer highest = null;

		for (int i = 0; i < bank.getCustomers().size(); i++) {

			highest = bank.getCustomers().get(i);

			for (int j = 1; j < bank.getCustomers().size(); j++) {

				if (highest.total() > bank.getCustomers().get(j).total()) {

					highest = bank.getCustomers().get(j);
				}
			}
		}

		return highest;

	}

}
