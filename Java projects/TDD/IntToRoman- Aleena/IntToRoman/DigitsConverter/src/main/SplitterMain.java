package main;
import java.util.List;
import java.util.Scanner;


public class SplitterMain {
		
  public static void main(String args[])
  {  	
		  
		  String choice = "";	
		  int inputSplit;	
		  List<Integer> list;
		  Scanner sc = new Scanner(System.in);
		  
	      do
	      {
	    	  
	      System.out.println( "Enter any integer : ");
	    
		  // give input
	      inputSplit = sc.nextInt();  
		  	  
		  // try giving input values of 82,54,99,156,328,1979,2044 to split method
		  // storing result of static split method 
		  list = DecimalSplitter.splitNumbers(inputSplit);
		  
		  System.out.println("Output of split Function for "+inputSplit);
		  
		  for(Integer num:list)
		  {	
			  // printing output after method completion
			  System.out.println(num);
			  
		  }
		  
		  System.out.println("Do you want to continue Y or N");
			
		  choice = sc.next();

	      }while(choice.equalsIgnoreCase("Y"));
	  
	      sc.close();		  
		  	  
		}  
	  
	}
