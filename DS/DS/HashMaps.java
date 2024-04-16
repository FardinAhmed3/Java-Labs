package DS;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		// This is how to implement a hashmap

		HashMap<String, String> Cities = new HashMap<String, String>();

		Cities.put("SK", "Seoul");
		Cities.put("Japan", "Tokyo");
		Cities.put("China", "Shenzhen");
		Cities.put("England", "Liverpool");
		Cities.put("USA", "NYC");
		System.out.println(Cities.get("SK"));
		System.out.println(Cities.get("Japan"));

		System.out.println("Size of the Hasmap is " + Cities.size());

		System.out.println("The keys to the HashMap are " + Cities.keySet());
		System.out.println("The values corresponding to the keys are " + Cities.values());

		/*
		 * HashMap<format,format>name=new HashMap<format,format>()
		 * name.put("key","element") //Sets the key to the element and the element
		 * itself name.get("key") //Returns the element name.size() //Returns the size
		 * of the HashMap name.clear() //Removes all the elements from the HashMap
		 * name.remove("Key") //Removes the element and the key name.keySet() //Returns
		 * all the keys in LIFO/Reverse Order name.values() //Returns all the
		 * corresponding elements in LIFO/Reverse order
		 * 
		 * NOTE: Hashmap can contain String/Int keys and Values. Meaning int keys or
		 * string keys can lead to int values or string values. Flexible DS.
		 * 
		 * 
		 */
	}

}
