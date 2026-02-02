package adressbook.service;

import java.util.HashMap;

import java.util.Map;

import adressbook.dao.AddressBookDao;
import adressbook.model.Contacts;

public class AddressBookService {
	private Map<String, AddressBookDao> addressBooks = new HashMap<>();
	private String currentBook = "";
	
	public AddressBookService() {
		addressBooks.put("defaultBook", new AddressBookDao());
	}
	// UC-6
	public void createAddressBook(String name) {
		if(!addressBooks.containsKey(name)) {
			addressBooks.put(name,  new AddressBookDao());
			System.out.println("Address Book Created");
		}else {
			System.out.println("Already exist "+ name +" Address book");
		}
	}
	
	public void selectAddressBook(String name) {
		if(addressBooks.containsKey(name)) {
			currentBook = name;
			System.out.println("Selected "+ name+"Adress Book");
		}else {
			System.out.println("Book Not Found");
		}
	}
	
	// UC-2,5
	public void addContact(Contacts contact) {
		if(currentBook.equals("")) {
			System.out.println("Please Select a book First");
			return;
		}
		AddressBookDao dao = addressBooks.get(currentBook);
		boolean added = dao.addContact(contact);
		
		if(added) {
			System.out.println("Conntact Added Sucessfully");
		}else{
			System.out.println("Failed to Add Contact");
		}
	}
	
	// UC-3
	public void editContact(String firstName, String lastName, Contacts updated) {
		if(currentBook.equals("")) {
			System.out.println("Please Select a book First");
			return;
		}
		AddressBookDao dao = addressBooks.get(currentBook);
		boolean added = dao.addContact(updated);
		boolean edited = dao.editContact(firstName, lastName, updated);
		if(edited) {
			System.out.println("Contact Edited Succesfully");
		}else {
			System.out.println("Contact Not found");
		}
	}
	
	
	// UC-4
	public void deleteContact(String firstName, String lastName) {
		boolean delete = addressBooks.get(currentBook).deleteContact(firstName, lastName);
		if(delete) {
			System.out.println("Contact Deleted Succesfully");
		}else {
			System.out.println("Contact Not Found");
		}
	}
	public void displayContact() {
		addressBooks.get(currentBook).displayAll();
	}
	
	// UC-8
	public void searchPerson(String name) {
		addressBooks.get(currentBook).searchPerson(name);
	}
	 // UC-9
	public void viewbyState(String state) {
		addressBooks.get(currentBook).viewbyState(state);
	}
	
	public void viewbyCity(String city) {
		addressBooks.get(currentBook).viewbyCity(city);
	}
	
	// UC-10
	public void countbyCity(String city) {
		addressBooks.get(currentBook).countbyCity(city);
	}
	
	public void countbyState(String state) {
		addressBooks.get(currentBook).countbyState(state);
	}
	
	// UC-11
	public void sortbyName() {
		addressBooks.get(currentBook).sortbyName();
	}
		
	// UC-12
	public void sortbyCity() {
		addressBooks.get(currentBook).sortbyCity();
	}
	
	public void sortbyState() {
		addressBooks.get(currentBook).sortbyState();
	}
	
	public void sortbyZip() {
		addressBooks.get(currentBook).sortbyZip();
	}
	
	
	
}
