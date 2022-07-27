package phase1.mp;
import java.util.ArrayList;
import java.util.Scanner;     
public class email {  
	    public static void main(String args[])
	    {  
	    	ArrayList<String> Email = new ArrayList<String>();
	        //using add() to initialize values
	        Email.add("XYZ@gmail.com");
	        Email.add("anand@gmail.com");
	        Email.add("abc@gmail.com");
	        Email.add("pqr@gmail.com");
	        Email.add("varun@gmail.com");
	        Email.add("praveen@gmail.com");
	        Email.add("k7@gmail.com");
	        //Getting input from user using Scanner class
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter email: ");
	        String SearchEmail = input.nextLine();
	        input.close();
	        // using contains() to check if the element
	        boolean ans = Email.contains(SearchEmail);
	        if(ans){
	            System.out.print("Entered Email ID is Found");
	        }
	        else{
	           System.out.println("Entered Email ID is not found");
	        }
	            
	    }

	}