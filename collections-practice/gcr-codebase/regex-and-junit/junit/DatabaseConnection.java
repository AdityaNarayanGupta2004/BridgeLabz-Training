package junit.demo;

public class DatabaseConnection {
	boolean connected = false;
	public void connect() {
		connected = true;
		System.out.println("Database Connected");
	}
	
	public void disconnect() {
		connected = false;
		System.out.println("Databse connected");
	}
	
	public boolean isConnected() {
		return connected;
	}
}
