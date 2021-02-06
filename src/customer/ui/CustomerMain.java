package customer.ui;

import customer.beans.*;

public class CustomerMain {
	public static void main(String args[]) {
		CustomerMain project = new CustomerMain();
		project.start();

	}

	public void start() {
		Customer customers[] = new Customer[3];
		Customer customer1 = new Customer(1, "abhishek", 521.3);

		Customer customer2 = new Customer(2, "mayank", 700.1);

		Customer customer3 = new Customer(3, "rohit", 721.3);
		displayCustomer(customer3);
		customer3.setName("rohan");
		
		customers[0] = customer1;
		customers[1] = customer2;
		customers[2] = customer3;
		for (int i = 0; i < customers.length; i++) {
			Customer iteratedCustomer = customers[i];
			displayCustomer(iteratedCustomer);
		}

	}

	void displayCustomer(Customer customer) {
		int id = customer.getId();
		String name = customer.getName();
		double balance = customer.getBalance();

		System.out.println("customer" + id + " " + name + " " + balance);

	}

}
