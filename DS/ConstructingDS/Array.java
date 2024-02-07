package ConstructingDS;

class Array {
	Array(int capacity) {
		arr = new int[capacity];
		}
	Array() {
		this(DEFAULT_CAPACITY);
		}

	int get(int index) {
		return arr[index];
		}

	void set(int index, int value) {
		arr[index] = value;
		}

	int length() {
		return arr.length;
		}

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
