package adressbook.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import adressbook.model.Contacts;

public class AddressBookDao {
	private List<Contacts> contacts = new ArrayList<>();
	
	// UC-1 Creating a Contact
	public boolean addContact(Contacts contact) {
//		return contacts.add(contact);
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
			if(c.getstate().equals(state)) {
				c.displayAll();
			}
		}
	}
	
	public void viewbyCity(String city) {
		for(Contacts c: contacts) {
			if(c.getcity().equals(city)) {
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

//		contacts.sort(Comparator.comparing(Contacts::getfirstName, String.CASE_INSENSITIVE_ORDER)
//				.thenComparing(Contacts::getlastName, String.CASE_INSENSITIVE_ORDER));
		
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
	
	// UC-13 Write to Text File
	public void writeToTextFile() {
	    try {
	        java.io.BufferedWriter writer =
	                new java.io.BufferedWriter(
	                        new java.io.FileWriter("addressbook.txt"));

	        for (Contacts c : contacts) {
	            writer.write(c.getfirstName() + "," +
	                    c.getlastName() + "," +
	                    c.getaddress() + "," +
	                    c.getcity() + "," +
	                    c.getstate() + "," +
	                    c.getZip() + "," +
	                    c.getphoneNumber() + "," +
	                    c.getemail());
	            writer.newLine();
	        }
	        writer.close();
	        System.out.println("Data written to Text File");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	// UC-13 Read from Text File
	public void readFromTextFile() {
	    try {
	        java.io.BufferedReader reader =
	                new java.io.BufferedReader(
	                        new java.io.FileReader("addressbook.txt"));

	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        reader.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	// UC-14 Write CSV
	public void writeToCSV() {
	    try {
	        com.opencsv.CSVWriter writer =
	                new com.opencsv.CSVWriter(
	                        new java.io.FileWriter("addressbook.csv"));

	        for (Contacts c : contacts) {
	            writer.writeNext(new String[]{
	                    c.getfirstName(),
	                    c.getlastName(),
	                    c.getaddress(),
	                    c.getcity(),
	                    c.getstate(),
	                    c.getZip(),
	                    c.getphoneNumber(),
	                    c.getemail()
	            });
	        }
	        writer.close();
	        System.out.println("CSV File Written Successfully");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	// UC-14 Read CSV
	public void readFromCSV() {
	    try {
	        com.opencsv.CSVReader reader =
	                new com.opencsv.CSVReader(
	                        new java.io.FileReader("C:\\Users\\Aditya Narayan Gupta\\eclipse-workspace\\AdressBookSystem\\addressbook.csv"));

	        String[] data;

	        while ((data = reader.readNext()) != null) {
	            Contacts contact = new Contacts(
	                    data[0],  // firstName
	                    data[1],  // lastName
	                    data[2],  // address
	                    data[3],  // city
	                    data[6],  // phoneNumber
	                    data[4],  // state
	                    data[5],  // zip
	                    data[7]   // email
	            );

	            contact.displayAll();
	            System.out.println("*-*-*-*-*-*-*-*-*");
	        }

	        reader.close();
	        System.out.println("CSV File Read Successfully");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	// UC-15 Write JSON
	public void writeToJSON() {
	    try {
	        com.google.gson.Gson gson =
	                new com.google.gson.Gson();

	        java.io.FileWriter writer =
	                new java.io.FileWriter("C:\\Users\\Aditya Narayan Gupta\\eclipse-workspace\\AdressBookSystem\\addressbook.json");

	        gson.toJson(contacts, writer);
	        writer.close();
	        System.out.println("JSON File Written Successfully");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}	
	
	// UC-15 Read JSON
	public void readFromJSON() {
	    try {
	        com.google.gson.Gson gson =
	                new com.google.gson.Gson();

	        java.io.FileReader reader =
	                new java.io.FileReader("addressbook.json");

	        Contacts[] contactArray =
	                gson.fromJson(reader, Contacts[].class);

	        for (Contacts c : contactArray) {
	            c.displayAll();
	            System.out.println("*-*-*-*-*-*-*-*-*");
	        }

	        reader.close();
	        System.out.println("JSON File Read Successfully");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
