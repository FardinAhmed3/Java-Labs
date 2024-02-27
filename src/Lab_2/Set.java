package Lab_2;
/*lab 2.1.1 Set */

class Set<genericType> {					//I use genericType to help me understand what I am doing
	@SuppressWarnings("unchecked")
	genericType [] arr;
	int capacity=0;
	int size=0;
	static final int INITIAL_CAPACITY=10;
/*
 * OK SO... @suppressWarnings("unchecked") means that its using unchecked exception handling
 * Class must be named class nameOfClass<nameOfGenericType> in order to use Java Generics
 * This is a resizable container class meaning we don't need a default capacity (or pass in a parameter to make a certain size)
 * This container is resizable so we just need an initial capacity to work with. If we need to resize it, we'll resize it using checkCapacity()
 * 
 */

	Set(){
		this.capacity=INITIAL_CAPACITY;
		arr=(genericType [])new Object[capacity];		//Type casting -- allows creating array generics
	}

	boolean contains(genericType elementOfSet) {		//Must declare the genericType to make sure parameters work in SetApp, also thats how java works
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(elementOfSet)) {
                return true;
            }
        }
        return false;
    }

/* 	void add(genericType value) {				//Must declare the genericType to make sure parameters work in SetApp
	if (!contains(value)) {
		if (size < arr.length) {
			arr[size++] = value;
			}
		else{
			checkCapacity();
		}
		}
	}*/


	void add(genericType value){
		if(!contains(value)){
			if(size>=arr.length){
				checkCapacity();
			}
			arr[size++] = value;
		}
	}
	
	int getCapacity() {return arr.length;}
	int size() {return size;}

	private void checkCapacity(){
		if(size	<capacity) {return;}
		else{
			capacity =capacity*2;
			@SuppressWarnings("unchecked")
			genericType [] temp=(genericType[]) new Object[capacity];
			for(int i=0; i<size; i++) {
				temp[i] = arr[i];
			arr=temp;
		}
	}
}

	public String toString() {
		String result = "{";
		for (int i = 0; i < size; i++)
			result += arr[i] + (i < size-1 ? ", " : "");
		result += "}";
		return result;
	}

	
}


