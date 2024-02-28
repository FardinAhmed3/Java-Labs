package Lab_2;
import java.util.Random;

/*Lab 2.1.2 */
public class SetApp {

	public static void main(String[] args) {
		basics();
		capacityManagement();
		generics();
		ElementOrder();
	}

	static void basics(){
		System.out.println("=== Basic Functionality ===");
		System.out.println();

		System.out.println("--- Creating a Set<Integer> and printing it and its initial stats ---");
		Set<Integer> S = new Set<Integer>();
		System.out.println(S+ " ("+S.size()+ "/"+S.getCapacity()+")");
		System.out.println();

		System.out.println("--- Loading it up to capacity with add ---");
		for(int i =0; i<S.getCapacity();i++){
			S.add(i*10);
		System.out.println("Adding "+i+" -> "+S+ " ("+S.size()+"/"+S.getCapacity()+")");
		}
		System.out.println();

		System.out.println("--- Loading it up with the same elements ---" );
		for(int i =0;i<S.getCapacity();i++){
			S.add(i*10);
			System.out.println("Adding "+i+ " -> "+ S+" ("+S.size()+"/"+S.getCapacity()+")");
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
	}
		static void capacityManagement() {
		System.out.println();
		System.out.println("=== Capacity Management ===");
		System.out.println();
		Set<Double> sd = new Set<Double>();

		System.out.println("--- Creating a Set<Double> and loading it up with 1,000 elements ---");

		sd.add(0.0);
		System.out.println(sd+" ("+sd.size()+"/"+sd.getCapacity()+")");

		for (double i = 0; i <= 10; i++) {
			sd.add(i);
		}
		System.out.println(sd+" ("+sd.size()+"/"+sd.getCapacity()+")");
		for (double i = 0; i <= 20; i++) {
			sd.add(i);
		}
		System.out.println(sd+" ("+sd.size()+"/"+sd.getCapacity()+")");

		for (double i = 0; i <= 40; i++) {
			sd.add(i);
		}
		System.out.println("("+sd.size()+"/"+sd.getCapacity()+")"+" ... resized");

		for (double i = 0; i <= 80; i++) {
			sd.add(i);
		}
		System.out.println("("+sd.size()+"/"+sd.getCapacity()+")"+" ... resized");

		for (double i = 0; i <= 160; i++) {
			sd.add(i);
		}
		System.out.println("("+sd.size()+"/"+sd.getCapacity()+")"+" ... resized");

		for (double i = 0; i <= 320; i++) {
			sd.add(i);
		}
		System.out.println("("+sd.size()+"/"+sd.getCapacity()+")"+" ... resized");

		for (double i = 0; i <= 640; i++) {
			sd.add(i);
		}
		System.out.println("("+sd.size()+"/"+sd.getCapacity()+")"+" ... resized");

		for (double i=0;i<1000;i++){
			sd.add(i);
		}
		System.out.println("("+sd.size()+"/"+sd.getCapacity()+")");
		System.out.println();
	}
	
	static void generics(){
		System.out.println("=== Generics ===");
		System.out.println();
		System.out.println("--- Set<Double> ---");
		Set<Double> sd=new Set<Double>();
		for (double i=0; i<10;i++){
			sd.add(i);
		}
		System.out.println(sd);
		System.out.println();

		System.out.println("--- Set<String> ---");
		Set<String> ss=new Set<String>();
		for (int i=0; i<7;i++){
			ss.add("Str"+i);
		}
		System.out.println(ss);
		System.out.println();

		System.out.println("--- Set<Set<Integer>> ---");


		Set<Set<Integer>> nestedSet = new Set<>();

        for (int i = 0; i <= 4; i++) {
            Set<Integer> innerSet = new Set<>();
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
		System.out.println("--- Adding 10 random values to a Set<Integer> using a Random object with seed=12345 ---");

		Random num=new Random(12345);
		Set<Integer>seo=new Set<>();

		for(int i=0;i<10;i++){
			int randomNumber=num.nextInt(100);

			seo.add(randomNumber);
			System.out.println("adding "+randomNumber+" -> "+seo);
		}
			System.out.println(seo);
	}
}