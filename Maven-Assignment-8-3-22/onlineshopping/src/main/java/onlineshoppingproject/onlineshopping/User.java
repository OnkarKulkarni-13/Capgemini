package onlineshoppingproject.onlineshopping;

public class User {
	private String username;
	private String email;
	private String password;
	private String shipping_address;
	
	public User() {
		
	}
	
	public User(String username, String email, String password, String shipping_address, String biling_address) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.shipping_address = shipping_address;
		this.biling_address = biling_address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getShipping_address() {
		return shipping_address;
	}
	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}
	public String getBiling_address() {
		return biling_address;
	}
	public void setBiling_address(String biling_address) {
		this.biling_address = biling_address;
	}
	private String biling_address;

}
