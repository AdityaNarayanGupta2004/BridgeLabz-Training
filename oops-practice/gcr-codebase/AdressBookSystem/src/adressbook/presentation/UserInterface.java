package adressbook.presentation;

import java.util.*;

import adressbook.model.Contacts;
import adressbook.service.AddressBookService;

public class UserInterface {
	private static Scanner sc = new Scanner(System.in);
	private static AddressBookService service = new AddressBookService();
	
	public static void showMenu() {
		System.out.println("\n1. Create Address Book");
		System.out.println("2.Select Adress Book");
		System.out.println("3. Add Contact");
		System.out.println("4. Edit Contact");
		System.out.println("5. Delete Contact");
		System.out.println("6. Display Contacts");
		System.out.println("7. Search Person by City/State");
		System.out.println("8. View Person BY state");
		System.out.println("9. View person by city");
		System.out.println("10. Count Contact by City");
		System.out.println("11.Count by State");
		System.out.println("12. Sort Contact Alphabetivally by Name");
		System.out.println("13. Sort Contact by City");
		System.out.println("14. Sort contact by State");
		System.out.println("15. Sort contact by Zip");
		System.out.println("16. Write Contacts to Text File");
		System.out.println("17. Read Contacts from Text File");
		System.out.println("18. Write Contacts to CSV File");
		System.out.println("19. Read Contacts to CSV File");
		System.out.println("20. Write Contacts to JSON File");
		System.out.println("21. Read Contacts to JSON File");
		System.out.println("22. Exit");
		System.out.println("Select option: ");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Adress Book Program"); // Displaying Welcome message
		boolean status = true;
		while(status) {
			try {
			showMenu();
			System.out.println("Please Enter your choice:");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1:
					System.out.println("Enter a Address Book Name: ");
					String adressbookName = sc.nextLine();
					service.createAddressBook(adressbookName);
					break;
				case 2:
					System.out.println("Enter a Address Book Name: ");
					String bookName = sc.nextLine();
					service.selectAddressBook(bookName);
					break;
				case 3:
					Contacts contact = takeContactInput();
					service.addContact(contact);
					break;
				case 4:
					System.out.println("Enter FirstName: ");
					String firstName = sc.nextLine();
					System.out.println("Enter LastName: ");
					String lastName = sc.nextLine();
					Contacts updated = takeContactInput();
					service.editContact(firstName, lastName, updated);
					break;
				case 5:
					System.out.println("Enter FirstName: ");
					String deletefirstName = sc.nextLine();
					System.out.println("Enter LastName: ");
					String deletelastName = sc.nextLine();
					service.deleteContact(deletefirstName, deletelastName);
					break;
				case 6:
					service.displayContact();
					break;
				case 7:
					System.out.println("Enter a City/State name: ");
					String name = sc.nextLine();
					service.searchPerson(name);
					break;
				case 8:
					System.out.println("Enter a state Name: ");
					service.viewbyState(sc.nextLine());
					break;
				case 9:
					System.out.println("Enter a city Name: ");
					service.viewbyCity(sc.nextLine());
					break;
				case 10:
					System.out.println("Enter a City: ");
					service.countbyCity(sc.nextLine());
					break;
				case 11:
					System.out.println("Enter State: ");
					service.countbyState(sc.nextLine());
					break;
				case 12:
					service.sortbyName();
					System.out.println("Contacts Sorted by Name is Done!");
					break;
				case 13:
					service.sortbyCity();
					System.out.println("Contacts Sorted by City is done!");
					break;
				case 14:
					service.sortbyState();
					System.out.println("Contacts Sorted by State is done!");
					break;
				case 15:
					service.sortbyZip();
					System.out.println("Contacts Sorted by Zip is Done!");
					break;
				case 16:
					service.writeToTextFile();
				    break;
				case 17:
				    service.readFromTextFile();
				    break;

				case 18:
				    service.writeToCSV();
				    break;
				case 19:
				    service.readFromCSV();
				    break;

				case 20:
				    service.writeToJSON();
				    break;
				case 21:
				    service.readFromJSON();
				    break;
				case 22:
					System.out.println("Thank You for visiting!");
					status = false;
					break;
				default:
					System.out.println("Visit Again");
				}
			}
			catch(Exception e) {
				System.out.println("Invalid Input! Please Enter a number.");
				sc.nextLine();
			}
		}
	}

	private static Contacts takeContactInput() {
		System.out.println("Enter firstName: ");
		String firstName = sc.nextLine();
		System.out.println("Last Name: ");
		String lastName = sc.nextLine();
		System.out.println("Address: " );
		String address = sc.nextLine();
		System.out.println("City: " );
		String city = sc.nextLine();
		System.out.println("Phone Number: " );
		String phoneNumber = sc.nextLine();
		System.out.println("State: " );
		String state = sc.nextLine();
		System.out.println("Zip: " );
		String zip = sc.nextLine();
		System.out.println("Email ID: " );
		String email = sc.nextLine();
		return new Contacts(firstName, lastName, address, city, phoneNumber, state, zip, email);
	}
}
