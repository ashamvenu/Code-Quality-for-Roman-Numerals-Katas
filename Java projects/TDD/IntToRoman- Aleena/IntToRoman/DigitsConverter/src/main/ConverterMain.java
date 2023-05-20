package main;
import java.util.Scanner;

public class ConverterMain {
	
	
	public static void main(String[] args)
	{	  
	
	  NumeralsConverter converter = new NumeralsConverter();
	  String convertedDigits;
	  String choice = "";	
	  int inputConvert;
	  Scanner sc = new Scanner(System.in);
	  
	  do{
		    System.out.println( "Enter the integer : ");
		    
			// give input
		    inputConvert = sc.nextInt();
			  
			// try giving input values of 1,2,3,5,9,20,82,199,800 to split method
			convertedDigits =  converter.inpConvert(inputConvert);
			  	  
			System.out.println("Output of convert Function for "+inputConvert);
			  
			// printing output string after method completion
			System.out.println(convertedDigits);
			
			System.out.println("Do you want to continue Y or N");
			
			choice = sc.next();

		}while(choice.equalsIgnoreCase("Y"));
	  
	    sc.close();
	  
	}
	
}
