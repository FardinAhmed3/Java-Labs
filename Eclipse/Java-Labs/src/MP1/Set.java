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
	
	void set(int index, int value) throws Exception {
		if(index>= size||index>0) throw new Exception("Index cannot be larger than size!");
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
	
	Boolean isEmpty() {
		if(size>0) {
			return false;
		}
		return true;
	}
	
	void remove(int index) {
		if(index>=0 && index<size) {
			for(int i=index;i<size-1;i++) {
				arr[i]=arr[i+1];
			}
			size--;
		}
	}
	
	/*
	 * This clear() method is objectively more
	 * memory efficient as opposed to a new system
	 * where it creates a smaller array and copies
	 * the elements over. clear() is O(1) at the moment
	 */
	void clear() {
		size=0;
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


