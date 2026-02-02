package adressbook.model;


// UC-1
public class Contacts {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String phoneNumber;
	private String state;
	private String zip;
	private String email;
	
	// Constructor
	public Contacts(String firstName,String lastName,String address,String city,String phoneNumber,
			String state,String zip,String email){
		this.firstName = firstName;
		this.lastName = lastName;
		this.address =address;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.state = state;
		this.zip = zip;
		this.email = email;
	}
	
	// Getter Method
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public String getaddress() {
		return address;
	}
	
	public String getcity() {
		return city;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	
	public String getstate() {
		return state;
	}
	
	public String getZip() {
		return zip;
	}
	
	public String getemail() {
		return email;
	}
	
	// Setter Method
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setaddress(String address) {
		this.address = address;
	}
	
	public void setcity(String  city) {
		this.city = city;
	}
	
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setstate(String state) {
		this.state = state;
	}
	
	public void setZip(String zip) {
		this.zip = zip;;
	}
	
	public void setemail(String email) {
		this.email = email;
	}
	
	// Display Method
	public void displayAll() {
		System.out.println("First Name: "+ firstName);
		System.out.println("LastName: " + lastName);
		System.out.println("Adress: "+ address);
		System.out.println("Phone Number: "+ phoneNumber);
		System.out.println("City: "+ city);
		System.out.println("State: "+ state);
		System.out.println("Zip: "+ zip);
		System.out.println("Emaid ID: "+ email);
	}
	
}
