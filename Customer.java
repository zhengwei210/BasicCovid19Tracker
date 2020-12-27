import java.util.*;

public class Customer {
  public static void main(String[] args) {
	do{
		Scanner custObj = new Scanner(System.in);
		System.out.println("=========================");
		System.out.println("- Sign in or Register? -");
		System.out.println("=========================");
		System.out.println("1. Register");
        System.out.println("2. Log In");
        System.out.println("3. Exit");
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
            System.out.println("Enter your name: ");
            custObj.nextLine();
            String logInName = custObj.nextLine();
            System.out.println("Welcome back!" + logInName);

        }
        
        else if(selection == 3)
        {
            break;
        }

        else
        {   
            System.out.println("Invalid input");
        }
    } while (true);
}
}