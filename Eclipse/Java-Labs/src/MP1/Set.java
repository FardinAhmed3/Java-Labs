package MP1;

public class Set {
	static final int DEFAULT_CAPACITY=10;
	int[] arr;
	int capacity,size=0;
	
	
	//Constructor for creating int arrays with given capacity
	public Set(int capacity) {
		this.capacity=capacity;
		int[] arr=new int[capacity];
	}
	
	//Constructor for creating int array with the default capacity
	public Set() {
		int[]arr=new int[DEFAULT_CAPACITY];
	}
	
	void set(int index, int value) {
		arr[index]=value;
	}
	
	void add(int value) {
		arr[size]=value;
		size++;
	}
}


