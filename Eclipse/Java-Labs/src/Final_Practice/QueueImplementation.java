package Final_Practice;
import java.util.*;


import java.util.Queue;

public class QueueImplementation {

	public static void main(String[]args) {
		
		Queue<String> names=new LinkedList<String>();
		
		
		names.add("Susy");
		names.add("Alain");
		
		
		System.out.println("Queue looks like "+names);
		
		System.out.println("First in queue "+names.peek());
		
		System.out.println("Removing from queue "+names.poll());
		System.out.println("Queue looks like "+ names);
		
		names.add("Jessy");
		
		System.out.println("First in queue "+names.peek());
		System.out.println("The entire queue looks like "+names);
		
		String chosen=names.peek();
		System.out.println(chosen);

		
		
	}
}
