
/**
 * Class containing the main method to be executed first. 
 * Also contains a few testobjects and a prompt for the user to type commands from the comman package
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;



public class Application {

	// static ApplicationState state = ApplicationState.ROOT;
	
	/*
	 * public void setState(ApplicationState state) { this.state = state; }
	 */

	
	
	public static void main(String args[]) {


		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("exemple 06/30/1996");
	      System.out.print("Enter date: ");
	      String str = sc.nextLine();
	 
	      try {
	         Date date = sdf.parse(str); 
	         System.out.println(date);
	        
	      } catch (ParseException e) { 
	         System.out.println("Parse Exception");
	      }
	
	}
}
