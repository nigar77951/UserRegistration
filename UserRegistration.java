import java.util.regex.*;
import java.util.*;
public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter last Name:");
		String lname=sc.nextLine();
		if(lname == null)
			System.out.println("Invalid");
		String RegExlname = "^[A-Z]{1}[a-z]{2,}$";
	    Pattern pattern = Pattern.compile(RegExlname);
		if(pattern.matcher(lname).matches()) {
			System.out.println("valid");
		} else {
			System.out.println("Invalid"); 
		}
	}
}
