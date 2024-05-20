package Final_Practice;

import java.util.LinkedList;
import java.util.*;
public class LinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FIFO Queue Implementation using a LinkedList
		LinkedList<String> stack=new LinkedList<>();
		
		stack.addFirst("Susan");
		stack.addFirst("Alain");
		stack.addFirst("Einsvon");
		
		
		System.out.println(stack);
		
		System.out.println("First out! "+ stack.removeFirst());
		System.out.println("Second Out! "+stack.removeFirst());
		System.out.println("Third Out! "+stack.removeFirst());
		
		//FIFO Queue
		Queue<String> FIFOQueue=new LinkedList<>();
		
		FIFOQueue.add("James");
		FIFOQueue.add("York");
		FIFOQueue.add("Vettel");
		
		System.out.println("Queue Looks Like "+FIFOQueue);
		System.out.println("First Out! "+FIFOQueue.poll());
		System.out.println("Second Out! "+FIFOQueue.poll() );
		
		
		
		
	}

}
