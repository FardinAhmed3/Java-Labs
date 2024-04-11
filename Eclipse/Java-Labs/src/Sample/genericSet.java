package Sample;

public class genericSet<E>{
	E[] arr;
	int size,capacity=0;
	static final int INITIAL_CAPACITY=10;
	
	genericSet(int Capacity){
		this.capacity=INITIAL_CAPACITY;
		arr=(E[]) new Object[capacity];
	}
	void checkCapacity(){
		if(size<capacity){return;}
		E[] temp;
		capacity=capacity*2;}
	
	
	
}
