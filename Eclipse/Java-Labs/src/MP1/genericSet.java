package MP1;

public class genericSet<E> {
	E[] arr;
	int size, capacity =0;
	static final int INITIAL_CAPACITY=10;
	@SuppressWarnings("unchecked")
	genericSet(){
		this.capacity=INITIAL_CAPACITY;
		arr=(E[]) new Object[capacity];
	}
	
	void add(E value) {
		arr[size]=value;
		size++;
	}
	
	void append (E value) {
		arr[size]=value;
	}
	
	
	
	public String toString() {	//camelCase the NAME!
		String result ="[";
		for (int i=0;i<size;i++) {
			result+= arr[i]+ (i<size-1 ? ",":"");}
		result+="]";
		return result;
	}
	
	
	
}
