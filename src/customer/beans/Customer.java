package customer.beans;

public class Customer {
	private int id;
	private double balance;
	private String name;
	 
	public Customer(int idArg, String nameArg, double balanceArg){
		this.id=idArg;
	    this.name=nameArg;
	    this.balance=balanceArg;
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setScore(double balance) {
		this.balance=balance;
	}

}
