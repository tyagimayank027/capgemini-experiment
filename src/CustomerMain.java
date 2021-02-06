
public class CustomerMain {
	public static void main(String args[]) {
		CustomerMain project = new CustomerMain();
		project.start();

	}

	public void start() {
		Customer customers[] = new Customer[3];
		Customer customer1 = new Customer();
		customer1.id = 1;
		customer1.name = "abhishek";
		customer1.balance = 521.3;

		Customer customer2 = new Customer();
		customer2.id = 2;
		customer2.name = "mayank";
		customer2.balance = 700.1;

		Customer customer3 = new Customer();
		customer3.id = 3;
		customer3.name = "rohit";
		customer3.balance = 911.1;

		customers[0] = customer1;
		customers[1] = customer2;
		customers[2] = customer3;
		for (int i = 0; i < customers.length; i++) {
			Customer iteratedCustomer = customers[i];
			displayCustomer(iteratedCustomer);
		}

	}

	void displayCustomer(Customer customer) {
		String feedback = customer.status();
		System.out.println("customer" + customer.id + " " + customer.name + " " + customer.balance + " " + feedback);

	}

}
