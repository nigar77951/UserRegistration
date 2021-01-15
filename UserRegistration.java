import java.util.regex.*;
import java.util.*;
public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Name:");
		String fname=sc.nextLine();
		if(fname == null)
			System.out.println("Invalid");
		String RegExFname = "^[A-Z]{1}[a-z]{2,}$";
	    Pattern pattern = Pattern.compile(RegExFname);
		if(pattern.matcher(fname).matches()) {
			System.out.println("valid");
		} else {
			System.out.println("Invalid"); 
		}
	}
}
