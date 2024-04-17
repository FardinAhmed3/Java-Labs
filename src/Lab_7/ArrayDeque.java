public class ArrayDeque<E> {
    E[] arr;
    int size,capacity=0;
    static final int INITIAL_CAPACITY=5;

    @SuppressWarnings("unchecked")
	ArrayDeque(){
		this.capacity=INITIAL_CAPACITY;
		arr=(E [])new Object[capacity];		
	}


}
