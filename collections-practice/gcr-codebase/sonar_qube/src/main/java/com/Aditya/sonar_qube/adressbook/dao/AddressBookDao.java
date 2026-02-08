// package adressbook.dao;
package com.Aditya.sonar_qube.adressbook.dao;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.Aditya.sonar_qube.adressbook.model.Contacts;
// import adressbook.model.Contacts;

public class AddressBookDao {
	private List<Contacts> contacts = new ArrayList<>();
	
	// UC-1 Creating a Contact
	public boolean addContact(Contacts contact) {
		 for (int i = 0; i < contacts.size(); i++) {
			 Contacts existing = contacts.get(i);
			 if (existing.equals(contact)) {
				 System.out.println("Duplicate Contact Found!");
				 return false;
				 }
			 }
		 contacts.add(contact);
		 return true;
	}
	
	public boolean editContact(String firstName, String lastName, Contacts updated) {
		for(int i = 0; i < contacts.size(); i++) {
			Contacts c = contacts.get(i);
			if(c.getfirstName().equalsIgnoreCase(firstName) && c.getlastName().equalsIgnoreCase(lastName)) {
				c.setfirstName(updated.getfirstName());
				c.setlastName(updated.getlastName());
				c.setaddress(updated.getaddress());
				c.setcity(updated.getcity());
				c.setZip(updated.getZip());
				c.setphoneNumber(updated.getphoneNumber());
				c.setemail(updated.getemail());
				c.setstate(updated.getstate());
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteContact(String firstName, String lastName) {
		for(int i =0; i < contacts.size(); i++) {
			Contacts c = contacts.get(i);
			if(c.getfirstName().equalsIgnoreCase(firstName) && c.getlastName().equalsIgnoreCase(lastName)) {
				contacts.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void displayAll() {
		for(Contacts c: contacts) {
			c.displayAll();
			System.out.println("*-*-*-*-*-*-*-*-*");
		}
	}
	public void searchPerson(String name) {
		for(Contacts c: contacts) {
			if(c.getcity().equalsIgnoreCase(name) || c.getstate().equalsIgnoreCase(name)) {
				c.displayAll();
			}
		}
	}
	
	public void viewbyState(String state) {
		for(Contacts c: contacts) {
			if(c.getstate().equalsIgnoreCase(state)) {
				c.displayAll();
			}
		}
	}
	
	public void viewbyCity(String city) {
		for(Contacts c: contacts) {
			if(c.getcity().equalsIgnoreCase(city)) {
				c.displayAll();
			}
		}
	}
	
	public void countbyCity(String city) {
        int count = 0;
        for (Contacts c : contacts) {
            if (c.getcity().equalsIgnoreCase(city)) {
                count++;
            }
        }
        System.out.println("Count: " + count);
	}
	
	public void countbyState(String state) {
		int count = 0;
		for(Contacts c: contacts) {
			if(c.getstate().equalsIgnoreCase(state)) {
				count++;
			}
		}
		System.out.println("Count: "+ count);
	}
	
	public void sortbyName() {
		Collections.sort(contacts, new Comparator<Contacts>() {
		    @Override
		    public int compare(Contacts c1, Contacts c2) {
		        int first = c1.getfirstName().compareToIgnoreCase(c2.getfirstName());
		        if (first != 0) return first;
		        return c1.getlastName().compareToIgnoreCase(c2.getlastName());
		    }
		});
		System.out.println("Sorted by Name");
	}
	public void sortbyCity() {
		contacts.sort(Comparator.comparing(Contacts::getcity, String.CASE_INSENSITIVE_ORDER));
	}
	
	public void sortbyState() {
		contacts.sort(Comparator.comparing(Contacts::getstate, String.CASE_INSENSITIVE_ORDER));
	}
	
	public void sortbyZip() {
		contacts.sort(Comparator.comparing(Contacts::getZip, String.CASE_INSENSITIVE_ORDER));
	}
}
