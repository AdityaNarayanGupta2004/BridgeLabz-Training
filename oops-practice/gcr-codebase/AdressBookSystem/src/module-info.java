/**
 * 
 */
/**
 * 
 */
module AdressBookSystem {
	requires com.opencsv;
	requires com.google.gson;
//	requires java.net.http;
//	requires java.sql;
	
	opens adressbook.model to com.google.gson;


}