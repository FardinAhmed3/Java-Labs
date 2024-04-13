package Sample;

public class genericSet<E>{
	E[] arr;
	int size,capacity=0;
	static final int INITIAL_CAPACITY=10;
	
	genericSet(){
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
	public void add(E value){
		checkCapacity();
		arr[size]=value;
		size++;}
	public boolean contains(E value){
		for (int i=0;i<size;i++){
		if (arr[i]==value){return true;}
		}
		return false;
	}
	public int getSize(){return size;}
	public String toString(){
		String result="{";
		for (int i=0;i<size;i++){
		result+=arr[i]+(i<size-1?":":"");	
		}
		result+="}";
		return result;
	}
	
	
	
}
