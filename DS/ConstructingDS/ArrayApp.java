
package ConstructingDS;
public class ArrayApp {
	public static void main(String [] args) {
		Array a = new Array();
		System.out.println("length: " + a.length());

		for (int i = 0; i < a.length(); i++)
			a.set(i, i * 10);
		System.out.println("a: " + a);
		System.out.println("length: " + a.length());

		for (int i = 0; i < a.length(); i++)
			a.set(i, a.get(i)+1);
		System.out.println("a: " + a);
	}
}

class Array {
	Array(int capacity) {arr = new int[capacity];}
	Array() {this(DEFAULT_CAPACITY);}

	int get(int index) {return arr[index];}

	void set(int index, int value) {arr[index] = value;}

	int length() {return arr.length;}

	public String toString() {
		String result = "{";
		for (int i = 0; i < length(); i++)
			result += arr[i] + (i < length()-1 ? ", " : "");
		result += "}";
		return result;
	}

	int [] arr;
	static final int DEFAULT_CAPACITY = 10;
}