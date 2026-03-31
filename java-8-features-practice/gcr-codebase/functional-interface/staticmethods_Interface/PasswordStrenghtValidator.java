package Functional_Interface.staticmethods_Interface;

import java.util.function.Predicate;

public class PasswordStrenghtValidator {
	public static void main(String[] args) {
		Predicate<String> validator = SecurityUtils.passwordValidator();
		String password = "Insure123";
		if(validator.test(password)) {
			System.out.println("Strong Password");
		}else {
			System.out.println("Weak Password");
		}
	}
	public interface SecurityUtils{
		static Predicate<String> passwordValidator(){
			return password -> password!= null && password.length() >= 8;
		}
	}
}
