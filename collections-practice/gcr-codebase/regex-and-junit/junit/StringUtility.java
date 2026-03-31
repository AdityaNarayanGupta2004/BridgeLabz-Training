package junit.demo;

public class StringUtility {
	public String reverse(String str) {
		if(str == null) {
			return null;
		}
		return new StringBuilder(str).reverse().toString();
	}
	
	public boolean isPalendrome(String str) {
		if(str == null) {
			return false;
		}
		String rev = reverse(str);
		return str.equals(rev);
	}
	
	public String toUpperCase(String str) {
		if(str == null) {
			return null;
		}
		return str.toUpperCase();
	}
}
