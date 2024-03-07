package Lab_1;
public class SetApp {

	public static void main(String[] args) {
		app(new Set(5));
		System.out.println();
		app2(new Set(10));
		

	}
	static void app(Set s) {
		System.out.println("=== Testing a Set");
		System.out.println();
		System.out.println("capacity: " + s.getCapacity());
		System.out.println("size: "+s.size());
		System.out.println("s: "+s);
		System.out.println();
		System.out.println("Filling up the set");
		
		
		for(int i=1;i<=s.getCapacity();i++) {
			int ss=i*10;
			s.add(i*10);
			System.out.println("Added "+ss+" -> "+s);
		}
		System.out.println();
		System.out.print("Adding the same numbers again");

		for(int i=1;i<=s.getCapacity();i++) {
			int ss=i*10;
			s.add(i*10);
			System.out.print("\n"+"Added "+ss+" -> "+s);
		}
		System.out.println();
		System.out.println();

	}
	static void app2(Set s) {
		System.out.println("=== Testing a Set");
		System.out.println();
		System.out.println("capacity: " + s.getCapacity());
		System.out.println("size: "+s.size());
		System.out.println("s: "+s);
		System.out.println();
		System.out.println("Filling up the set");
		
		
		for(int i=1;i<=s.getCapacity();i++) {
			int ss=i*10;
			s.add(i*10);
			System.out.println("Added "+ss+" -> "+s);
		}
		System.out.println();
		System.out.print("Adding the same numbers again");

		for(int i=1;i<=s.getCapacity();i++) {
			int ss=i*10;
			//s.add(i*10);
			System.out.print("\n"+"Added "+ss+" -> "+s);
		}
		System.out.println();
		System.out.println();

	}
}
