import java.util.*;

public class Authentication {
  public static void main(String[] args) {
	do{
		Scanner custObj = new Scanner(System.in);
		System.out.println("=========================");
		System.out.println("- Sign in or Register? -");
		System.out.println("=========================");
		System.out.println("1. Register");
		System.out.println("2. Sign In");
		System.out.print("->");
		int selection = custObj.nextInt();

		if(selection == 1)
		{
		System.out.println("=========================");
	   	System.out.println("   Register an account   ");
		System.out.println("=========================");
		System.out.print("Enter your name: ");
		custObj.nextLine();
		String userName = custObj.nextLine();
		System.out.print("Enter your phone number: ");
		int phoneNo = custObj.nextInt();
		System.out.println("Thank you for your registration " + userName + "." + "Your phone number is " + phoneNo);
	    }
		
		else if(selection == 2)
		{
		System.out.println("=========================");
	    	System.out.println("         Log in          ");
		System.out.println("=========================");
		System.out.println("Enter your name: ")
			
		}
