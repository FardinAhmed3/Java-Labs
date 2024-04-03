package mp1;

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
		if(size>=arr.length) {
			checkCapacity2();}
		else{arr[size]=value;
	size++;}
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
	boolean contains(int value) {
		for(int i=0;i<size;i++) 
			if (arr[i]==value)
				return true;
		return false;
	}
	
	void exclusiveAdd(int value) {
		if(!contains(value)) { 
			arr[size]=value;
			size++;
			System.out.println("Value added");}
		else{System.out.println("Set already contains value");}
	}
	void checkCapacity() {
		if (size < capacity) return;
			int [] t = new int[capacity*2];
			
		for (int i = 0; i < size; i++)
			t[i] = arr[i];
		arr = t;
	}
	private void checkCapacity2(){
		if(size	<capacity) {return;}
		else{
			capacity =capacity*2;
			int[] temp=new int[capacity];
			for(int i=0; i<size; i++) {
				temp[i] = arr[i];
			}
		arr=temp;}
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


