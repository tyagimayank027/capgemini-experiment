
public class Customer {
	int id;
	double balance;
	String name;
	
	public String status() {
		String statusvalue;
		if(balance>700) {
			statusvalue="Rich";
		}else {
			statusvalue="poor";
		}
		return statusvalue;
	}


}
