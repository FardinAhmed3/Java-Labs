package Lab_2;
/*Lab 2.3 */
import java.util.TreeSet;
import java.util.Random;

public class TreeSetApp {
    public static void main(String[] args) {
		basics();
		generics();
		ElementOrder();
	}

	static void basics(){
		System.out.println("=== Basic Functionality ===");
		System.out.println();

		System.out.println("--- Creating a TreeSet<Integer> and printing it and its initial stats ---");
		TreeSet<Integer> S = new TreeSet<Integer>();
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
		System.out.println("--- TreeSet<Double> ---");
		TreeSet<Double> sd=new TreeSet<Double>();
		for (double i=0; i<10;i++){
			sd.add(i);
		}
		System.out.println(sd);
		System.out.println();

		System.out.println("--- TreeSet<String> ---");
		TreeSet<String> ss=new TreeSet<String>();
		for (int i=0; i<7;i++){
			ss.add("Str"+i);
		}
		System.out.println(ss);
		System.out.println();

	}

	static void ElementOrder(){
		System.out.println("=== Element Order ===");
		System.out.println();
		System.out.println("--- Adding 10 random values to A TreeSet<Integer> using a Random object with seed=12345 ---");

		Random num=new Random(12345);
		TreeSet<Integer>seo=new TreeSet<>();

		for(int i=0;i<10;i++){
			int randomNumber=num.nextInt(100);

			seo.add(randomNumber);
			System.out.println("adding "+randomNumber+" -> "+seo);
		}
			System.out.println(seo);
	}
}
