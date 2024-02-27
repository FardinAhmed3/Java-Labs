package Lab_2;

import java.util.Vector;

/*Lab 2.1.2 */
public class SetApp {

	public static void main(String[] args) {
		basics();
		capacityManagement();
	}

	static void basics(){
		System.out.println("=== Basic Functionality ===");
		System.out.println();

		System.out.println("--- Creating a Set and printing it and its initial stats ---");
		Set<Integer> S = new Set<Integer>();
		System.out.println(S+ " ("+S.size()+ "/"+S.getCapacity()+")");
		System.out.println();

		System.out.println("--- Loading it up to capacity with add ---");
		for(int i =0; i<S.getCapacity();i++){
			S.add(i*10);
		System.out.println(S+ " ("+S.size()+"/"+S.getCapacity()+")");
		}
		System.out.println();

		System.out.println("--- Loading it up with the same elements ---" );
		for(int i =1;i<S.getCapacity();i++){
			S.add(i*10);
			System.out.println("Adding "+i+ " -> "+ S+" ("+S.size()+"/"+S.getCapacity()+")");
		}
		System.out.println();

		System.out.println("--- Membership checking ---");
		for(int i=-50;i<150;i+=10){
			if(!S.contains(i)){
				System.out.println("set does not contain "+i);
			}
			else{
				System.out.println("set contains "+i);
			}
		}
	}
		static void capacityManagement() {
		System.out.println("=== Capacity Management ===");
		Set<Double> v = new Set<Double>();

		System.out.println("--- Creating Vector and loading it up with 1,000 elements ---");
		int oldCapacity = -1;
		for (int i = 0; i < 1000; i++) {
			v.add((double)i);
			System.out.println(v);
		}
	}
}