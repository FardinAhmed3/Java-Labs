public class ArrayDeque<E> {
    E[] arr;
    int size,capacity=0;
    static final int INITIAL_CAPACITY=5;

    @SuppressWarnings("unchecked")
	ArrayDeque(){
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
