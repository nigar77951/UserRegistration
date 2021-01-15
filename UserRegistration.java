import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an email:");
		String email=sc.nextLine();
		if(email == null)
			System.out.println("Invalid");
		String RegExemail = "^[A-Za-z0-9_]+[A-Za-z0-9_-]*([.]{1}[a-zA-Z-0-9]*)*[@]{1}[a-z]+[.][a-z]{2,6}([.][a-z0-9]{2})*$";
	    Pattern pattern = Pattern.compile(RegExemail);
		if(pattern.matcher(email).matches()) {
			System.out.println("valid");
		} else {
			System.out.println("Invalid"); 
		}
	}
	}
