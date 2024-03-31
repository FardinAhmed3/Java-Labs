package MP1;

public class Set {
	static final int DEFAULT_CAPACITY=10;
	int[] arr;
	int capacity,size=0;
	
	
	//Constructor for creating int arrays with given capacity
	Set(int Capacity) {
		this.capacity=Capacity;
		arr=new int[capacity];
	}
	
	//Constructor for creating int array with the default capacity
	Set() {
		this(DEFAULT_CAPACITY);
	}
	
	void set(int index, int value) {
		arr[index]=value;
		
	}
	
	void add(int value) {
		arr[size]=value;
		size++;
	}
	
	int getCapacity() {
		return capacity;
	}
	
	int getSize() {
		return size;
	}
	
	/*
	Java runtime calls this when 
	it wants a string representation
	*/
	public String toString() {
		String result="{";
		for (int i=0;i<size;i++) 
			result+=arr[i]+(i<size-1 ? ",":"");
		result+="}";
		return result;
		}
	

}


