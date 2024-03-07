package Lab_2;
/*lab 2.1.1 Set */

class Set<E> {					
	@SuppressWarnings("unchecked")
	E [] arr;
	int capacity=0;
	int size=0;
	static final int INITIAL_CAPACITY=10;


	Set(int i){
		this.capacity=INITIAL_CAPACITY;

		arr=(E [])new Object[capacity];		
	}

	boolean contains(E elementOfSet) {		
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(elementOfSet)) {
                return true;
            }
        }
        return false;
    }



	void add(E value){
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
			E [] temp=(E[]) new Object[capacity];
			for(int i=0; i<size; i++) {
				temp[i] = arr[i];
			}
		arr=temp;
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


