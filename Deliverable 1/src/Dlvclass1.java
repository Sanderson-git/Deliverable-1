import java.util.Scanner;

public class Dlvclass1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Hello, please enter a password that contains at least:");
		System.out.println("1 Lowercase letter");
		System.out.println("1 Uppercase letter");
		System.out.println("7 Characters minimum");
		System.out.println("12 Characters maximum");
		System.out.println("and an exclamation point: !");
		String password = scnr.nextLine();
		
		boolean isValid = true;
		
		boolean hasLowercase = !password.equals(password.toUpperCase());
		if(!hasLowercase) 
		{
			isValid = false; 
		}
		
		boolean hasUppercase = !password.equals(password.toLowerCase());
		if(!hasUppercase) 
		{
			isValid = false;
		}
		boolean isAtLeast7 = password.length() >= 7;//Checks for at least 8 characters
		if(!isAtLeast7)
		{
			isValid = false;
		}
		boolean isLessThan12 = password.length() <= 12;//Checks for less than 12
		if (!isLessThan12)
		{
			isValid = false;
		}
		boolean hasSpecial   = !password.matches("[A-Za-z0-9 ]*");//Checks at least one char is not alpha numeric
		if (!hasSpecial)
		{
			isValid = false;
		}
		boolean noConditions = !(password.contains("!"));//Check that it contains an exclamation
		if (noConditions)
		{
			isValid = false;
		}
		
		
		if (isValid == false)
		{
			System.out.println("Error");
		}
		
		if (isValid == true)
		{
			System.out.println("Password vaild and accepted.");
		}
		
		// TODO Auto-generated method stub

	}

}
