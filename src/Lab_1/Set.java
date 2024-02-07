package Lab_1;

public class Set {
	
	Set (int capacity){arr=new int[capacity];}	//Constructor creates array of capacity
	Set() {this(DEFAULT_CAPACITY);}				//Default Constructor

	int contains(int elementOfSet) {			//Contains method
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==elementOfSet) {
				System.out.println(elementOfSet+" is an element of the set");
			}
		}
		return 1;
	}

	void add(int value) {						//Add method
		arr[size++]=value;
	}
	
	int getCapacity() {return arr.length;}
	int size() {return size;}

	public String toString() {
		String result = "{";
		for (int i = 0; i < size; i++)
			result += arr[i] + (i < size-1 ? ", " : "");
		result += "}";
		return result;
	}
	int [] arr;
	int size = 0;
	static final int DEFAULT_CAPACITY = 10;
	
}

/*
class Vectore {
Vector (int capacity){arr=new int[capacity];}
Vector() {
	this(DEFAULT_CAPACITY);
}

int contains(int elementOfSet) {
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]==elementOfSet) {
			System.out.println(elementOfSet+" is an element of the set");
		}
	}
	return 1;
}

void add(int value) {
	arr[size++]=value;
}
int getCapacity() {return arr.length;}
int size() {return size;}

public String toString() {
	String result = "{";
	for (int i = 0; i < size; i++)
		result += arr[i] + (i < size-1 ? ", " : "");
	result += "}";
	return result;
}
int [] arr;
int size = 0;
static final int DEFAULT_CAPACITY = 10;

}

*/
