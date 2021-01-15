import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile number:");
		String mobileNumber=sc.nextLine();
		if(mobileNumber == null)
			System.out.println("Invalid");
		String RegExMobileNumber = "^[0-9]{1,3}[ ]{1}[1-9]{1}[0-9]{9}$";
	    Pattern pattern = Pattern.compile(RegExMobileNumber);
		if(pattern.matcher(mobileNumber).matches()) {
			System.out.println("valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
