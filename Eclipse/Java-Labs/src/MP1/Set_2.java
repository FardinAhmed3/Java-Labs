package MP1;

public class Set_2 {
int arr[];
int capacity, size=0;
static final int DEFAULT_CAPACITY=10;

Set_2(int Capacity){
	this.capacity=Capacity;
	arr=new int[capacity];
}

Set_2() {
	this(DEFAULT_CAPACITY);
}

void add(int value) {
	arr[size]=value;
	size++;
}

void set(int index, int value) {
	arr[index]=value;
}

int getCapacity() {
return size;	
}

int get(int index) {
	return arr[index];
}

int size() {
	return size;
}

public String toString() {
	String result="{";
	for (int i=0;i<size;i++) 
		result+=arr[i]+ (i<size-1 ? ",":"");
	result+="}";
	return result;
	}


	
}
