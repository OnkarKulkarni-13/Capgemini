package petstoreproject.petstroreapp;

public class CustomerService {
	private String serviceHelplineNumber;
	private String councellorName;
	public CustomerService() {
		// TODO Auto-generated constructor stub
		this.serviceHelplineNumber="+919322364778";
		this.councellorName="Onkar Kulkarni";
	}
	public String getServiceHelplineNumber() {
		return serviceHelplineNumber;
	}

	public String getCouncellorName() {
		return councellorName;
	}

	private static CustomerService cservice = new CustomerService();

	public static CustomerService customerInstance() {
		return cservice;	
	}

}
