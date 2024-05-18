/*  [X] Built in Array container
    [X] Initial Capacity 5
    [X]  CheckCapacity Method
    [X]  Single Default Constructor
    [X]  Container Generics
    []  Throw Exceptions
    []  Array should be treated as ring buffer
*/
public class ArrayDeque<E> {
    E[] arr;
    static final int INITIAL_CAPACITY=5;

    int capacity=INITIAL_CAPACITY;
    int front, rear,size;

    ArrayDeque(){
        arr=new arr[INITIAL_CAPACITY];
        front =-1;
        rear=-1;
        size=0;
    }

    @Override
    public void addFirst(E value) {
        checkCapacity();
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + capacity()) % capacity();
        }
        array[front] = value;
        size++;
    }
    public void addLast(E value) {
        checkCapacity();
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity();
        }
        array[rear] = value;
        size++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E removeFirst() {
        if (isEmpty()) {
            throw new CollectionException("ArrayDeque", "removeFirst", "Deque is empty");
        }
        E value = (E) array[front];
        array[front] = null; // Help GC
        front = (front + 1) % capacity();
        size--;
        if (isEmpty()) {
            front = -1;
            rear = -1;
        }
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E removeLast() {
        if (isEmpty()) {
            throw new CollectionException("ArrayDeque", "removeLast", "Deque is empty");
        }
        E value = (E) array[rear];
        array[rear] = null;
        rear = (rear - 1 + capacity()) % capacity();
        size--;
        if (isEmpty()) {
            front = -1;
            rear = -1;
        }
        return value;
    }

    
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
