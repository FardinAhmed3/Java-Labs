public class ArrayDeque<E> {
    E[] arr;
    int size, capacity = 0;
    int front, rear = 0;
    static final int INITIAL_CAPACITY = 5;

    @SuppressWarnings("unchecked")
    ArrayDeque() {
        this.capacity = INITIAL_CAPACITY;
        arr = (E[]) new Object[capacity];
    }

    void checkCapacity() {
        if (size < capacity) {
            return;
        }
        capacity = capacity * 2;
        @SuppressWarnings("unchecked")
        E[] temp = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[(front + i) % arr.length]; // Use arr.length for modulus
        }
        arr = temp;
        front = 0;
        rear = size;
    }

    void addFirst(E value) {
        checkCapacity();
        front = (front - 1 + capacity) % capacity;
        arr[front] = value;
        size++;
    }
    void removeFirst(E Value){



    }

    void removeLast(E Value){
        
    }



    //This method has a null value during operation 
    public void addLast(E value) {
        checkCapacity();
        arr[rear] = value;
        rear = (rear + 1) % getCapacity();
        size++;
    }

    boolean contains(E elementOfSet) {
        for (int i = 0; i < size; i++) {
            if (arr[(front + i) % capacity].equals(elementOfSet)) {
                return true;
            }
        }
        return false;
    }

    int getCapacity() {
        return capacity;
    }

    int size() {
        return size;
    }

    public String toString() {
        String result = "{";
        for (int i = 0; i < size; i++) {
            result += arr[(front + i) % capacity] + (i < size - 1 ? ", " : "");
        }
        result += "}";
        return result;
    }
}
