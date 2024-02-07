package Lab_1;

public class SetApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		app(new Set(5));
		System.out.println();
		app(new Set());
		

	}
	static void app(Set s) {
		System.out.println("capacity: " + s.getCapacity());
		System.out.println("size "+s.size());
		
		
		for(int i=0;i<s.getCapacity();i++) {
			s.add(i*10);
			System.out.println(s+ " ("+s.size()+") ");
		}

	}

}
