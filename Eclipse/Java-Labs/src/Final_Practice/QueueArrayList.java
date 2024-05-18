package Final_Practice;
import java.util.*;


public class QueueArrayList {
	public static void main (String[]args) {
		
		Queue<Integer> aq= new ArrayDeque<Integer>();
		
		for (int i=0; i<10;i++) {
			aq.add(i);
		}
		
		System.out.println("The Queue (of ArrayDeque) looks like "+ aq);

		ArrayDeque<Integer> ad=new ArrayDeque<>();
		
		for (int i=0; i<10;i++) {
			ad.add(i);
		}
		
		System.out.println("The ArrayDeque looks like "+ad);
		
		ad.removeFirst();
		System.out.println(ad);
		
		
		
	}
}
