package Final_Practice;
import java.util.*;


import java.util.Queue;

public class QueueImplementation {

	public static void main(String[]args) {
		
		Queue<String> names=new LinkedList<String>();
		
		
		names.add("Susy");
		names.add("Alain");
		
		
		System.out.println(names);
		
		System.out.println(names.peek());
		
		System.out.println(names.poll());
		System.out.println(names);
		
		names.add("Jessy");
		
		System.out.println(names.peek());
		System.out.println("The entire queue looks like "+names);
		
		String chosen=names.peek();		
		
	}
}
