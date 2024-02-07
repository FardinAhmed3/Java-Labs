package DS;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> engine = new ArrayList<String>();

		engine.add("inline-4");
		engine.add("Naturally Aspirated v6");
		engine.add("Turbo-Charged V6");
		engine.add("Twin-Turbo V6");
		engine.add("Naturally Aspirated V8");
		engine.add("Turbo-Charged V8");

		System.out.println(engine.size() + " Before all the operations");
		System.out.println(engine.get(1));

		engine.set(1, "Speedster NA-V6 Type-R VTEC");
		System.out.println(engine.get(1));
		engine.remove(1);
		System.out.println(engine.get(1));
		System.out.println(engine.size() + " After removing index 1 which was speedstar na-v6");

		// ArrayList<format> name = new ArrayList<format>();
		/*
		 * name.get(index) //Returns element at index
		 * name.set(index,"text/value according to format")//Reassigns element at index
		 * name.size() //Returns Size name.remove(index) //Removes element at index
		 * name.clear() //clears ArrayList
		 */

		for (int i = 0; i < engine.size(); i++) {
			System.out.println(engine.get(i));
		}
	}

}
