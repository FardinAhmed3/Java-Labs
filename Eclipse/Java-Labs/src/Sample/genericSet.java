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
		else{
		E[] temp;
		capacity=capacity*2;
		temp=(E[]) new Object[capacity];
		for (int i=0;i<size;i++){
		temp[i]=arr[i];
		}
		arr=temp;
		}
	}
	public boolean contains(){}

	public String toString(){
		String result="{";
		for (int i=0;i<size;i++){
		result+=arr[i]+(i<size-1?":":"");	
		}
		result+="}";
		return result;
	}
	
	
	
}
