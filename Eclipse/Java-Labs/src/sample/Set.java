package sample;

public class Set {
	int[] arr;
	int size, capacity=0;
	static final int DEFAULT_CAPACITY=10;
	
	Set(int Capacity){
		this.capacity=Capacity;
		arr=new int[capacity];
	}
	Set() {
		this(DEFAULT_CAPACITY);
	}
	
	void add(int value){
	if(size==getCapacity()) throw new IllegalStateException("Exceeded capacity");
	arr[size]=value;
	size++;
	}
	
	int getCapacity() {
		return arr.length;
	}
	
	int getSize() {
		return size;
	}
	
	boolean contains(int value) {
		for (int i=0;i<size;i++) {
			if (arr[i]==value) {
				return true;
			}
		} return false;
			
	}
	
	public String toString() {
		String result= "{";
		for(int i=0;i<size;i++) {
			result+=arr[i]+(i<size-1 ?",":"");
		}
		result+="}";
		return result;
	}

	void set(int index, int value) {
		if(index<0||index >= size) throw new IndexOutOfBoundsException ("Index cross bounds");
	arr[index]=value;
	
	}
	
	void clear() {
		size=0;
	}
	
	int get(int index) {
		if (index<0||index>=size) throw new IndexOutOfBoundsException("Index crossed bounds");
	return arr[index];
	}
	
	void checkCapacity() {
		if(size<capacity) {return;}
		else{capacity=capacity*2;
		int[]t=new int[capacity];
		for(int i=0;i<size;i++) {
			t[i]=arr[i];
		}
		arr=t;
	}
	}
	
	void addv2(int value) {
		if(size>=arr.length) {
			checkCapacity();
		}
		arr[size]=value;
		size++;
	}
	
	
}
