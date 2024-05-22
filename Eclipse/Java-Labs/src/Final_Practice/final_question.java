package Final_Practice;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



/*
 * Weiss 2664
Arnow 2662
Langsam 5657
CIS 5657
Sokol 2556
Goetz 5226




2664 Weiss
2662 Arnow

*/

public class final_question {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[]args) throws FileNotFoundException {
		Map<String,String> stdDir=new TreeMap<>();	
		Map<String, String> revDir=new TreeMap<>();
		
		Scanner scanner= new Scanner (new File("Directory.text")); //Scanner for the file
		
		while (scanner.hasNext()) {	//Goes over the file
			String name= scanner.next();	//Weiss
			String extension=scanner.next();	//2664
			
			
			stdDir.put(name, extension);
			
			revDir.put(extension,name);
			
			
					
		}
		System.out.println(stdDir);
		
	System.out.println(revDir);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
