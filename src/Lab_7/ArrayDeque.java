public class ArrayDeque<E> {
    E[] arr;
    int size,capacity=0;
    int front, rear=0;
    static final int INITIAL_CAPACITY=5;

    @SuppressWarnings("unchecked")
	ArrayDeque(){
		this.capacity=INITIAL_CAPACITY;
		arr=(E [])new Object[capacity];		
	}

    void checkCapacity(){
        if (size<capacity){return;}
		else{
			capacity =capacity*2;
			@SuppressWarnings("unchecked")
			E [] temp=(E[]) new Object[capacity];
			for(int i=0; i<size; i++) {
				temp[i] = arr[(front+i)%getCapacity()];
			}
		arr=temp;
        front=0;
        rear=size;
    }
}



    boolean contains(E elementOfSet) {		
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(elementOfSet)) {
                return true;
            }
        }
        return false;
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
