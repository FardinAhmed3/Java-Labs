package Lab_1;

public class Set {
	int [] arr;
	int size = 0;
	static final int DEFAULT_CAPACITY = 10;
	
	Set (int capacity){arr=new int[capacity];}	//Constructor creates array of capacity
	Set() {this(DEFAULT_CAPACITY);}				//Default Constructor


	boolean contains(int elementOfSet) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == elementOfSet) {
                return true;
            }
        }
        return false;
    }

void add(int value) {
	if (!contains(value)) {
		if (size < arr.length) {
			arr[size++] = value;
		}
	}
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
	/*int contains(int elementOfSet) {			//Contains method
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==elementOfSet) {
				System.out.println(elementOfSet+" is an element of the set");
			}
		}
		return 1;
	}*/
