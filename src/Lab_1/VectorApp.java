package Lab_1;

public class VectorApp {
	
	public static void main(String [] args) {
		doIt(new Vector(5));
		System.out.println();
		doIt(new Vector());
	}

	static void doIt(Vector v) {
		System.out.println("capacity: " + v.getCapacity());
		System.out.println("size: " + v.size());

		for (int i = 0; i < v.getCapacity(); i++) {
			v.add(i * 10);
			System.out.println(v + " (" + v.size() + ")");
		}

		for (int i = 0; i < v.size(); i++)
			v.set(i, v.get(i)+1);
		System.out.println("v: " + v);
	}
}
