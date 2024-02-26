class Set<> {
	@SuppressWarnings("unchecked")
	genericType [] arr;
	int capacity=0;
	int size=0;
	static final int INITIAL_CAPACITY=10;


	Set(){
		this.capacity=INITIAL_CAPACITY;
		arr=(genericType [])new Object[capacity];
	}
	//int [] arr;
	int size = 0;
	static final int DEFAULT_CAPACITY = 10;
	
	//Set (int capacity){arr=new int[capacity];}	//Constructor creates array of capacity
	//Set() {this(DEFAULT_CAPACITY);}				//Default Constructor




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


