package Lab_2;
/*Lab 2.2 */
import java.util.HashSet;
import java.util.Random;

public class HashSetApp {
    	public static void main(String[] args) {
		basics();
		generics();
		ElementOrder();
	}

	static void basics(){
		System.out.println("=== Basic Functionality ===");
		System.out.println();

		System.out.println("--- Creating a HashSet<Integer> and printing it and its initial stats ---");
		HashSet<Integer> S = new HashSet<Integer>();
		System.out.println(S+ " ("+S.size()+")");
		System.out.println();

		System.out.println("--- Loading it up to 10 with add ---");
		for(int i =0; i<10;i++){
			S.add(i*10);
		System.out.println("Adding "+i+" -> "+S+ " ("+S.size()+")");
		}
		System.out.println();

		System.out.println("--- Loading it up with the same elements  ---" );
		for(int i =0;i<10;i++){
			S.add(i*10);
			System.out.println("Adding "+i+ " -> "+ S+" ("+S.size()+")");
		}
		System.out.println();

		System.out.println("--- Membership checking  ---");
		for(int i=-50;i<150;i+=10){
			if(!S.contains(i)){
				System.out.println("set does not contain "+i);
			}
			else{
				System.out.println("set contains "+i);
			}
		}
        System.out.println();
	}
		
	
	static void generics(){
		System.out.println("=== Generics ===");
		System.out.println();
		System.out.println("--- HashSet<Double> ---");
		HashSet<Double> sd=new HashSet<Double>();
		for (double i=0; i<10;i++){
			sd.add(i);
		}
		System.out.println(sd);
		System.out.println();

		System.out.println("--- HashSet<String> ---");
		HashSet<String> ss=new HashSet<String>();
		for (int i=0; i<7;i++){
			ss.add("Str"+i);
		}
		System.out.println(ss);
		System.out.println();

		System.out.println("--- HashSet<HashSet<Integer>> ---");


		HashSet<HashSet<Integer>> nestedSet = new HashSet<>();

        for (int i = 0; i <= 4; i++) {
            HashSet<Integer> innerSet = new HashSet<>();
            for (int j = 0; j < i; j++) {
                innerSet.add(j);
            }
            nestedSet.add(innerSet);
        }
		System.out.println(nestedSet);
		System.out.println();
	}

	static void ElementOrder(){
		System.out.println("=== Element Order ===");
		System.out.println();
		System.out.println("--- Adding 10 random values to a HashSet<Integer> using a Random object with seed=12345 ---");

		Random num=new Random(12345);
		HashSet<Integer>seo=new HashSet<>();

		for(int i=0;i<10;i++){
			int randomNumber=num.nextInt(100);

			seo.add(randomNumber);
			System.out.println("adding "+randomNumber+" -> "+seo);
		}
			System.out.println(seo);
	}
}
