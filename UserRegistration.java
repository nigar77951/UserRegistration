import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your password:");
		String password=sc.nextLine();
		if(password == null)
			System.out.println("Invalid");
		String RegExPassword = ".{8,}$";
	    Pattern pattern = Pattern.compile(RegExPassword);
		if(pattern.matcher(password).matches()) {
			System.out.println("valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
