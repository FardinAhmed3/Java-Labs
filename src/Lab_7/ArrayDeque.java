public class ArrayDeque<E> {
    E[] arr;
    int size, capacity;
    int front, rear;
    static final int INITIAL_CAPACITY = 5;

    @SuppressWarnings("unchecked")
    ArrayDeque() {
        capacity = INITIAL_CAPACITY;
        arr = (E[]) new Object[capacity];
        front = 0;
        rear = 0;
        size = 0;
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
    // void removeFirst(E Value){

    // }
    E removeFirst() {
        if (size == 0) {
            return null;
        }
        E value = arr[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    // void removeLast(E Value){
        
    // }
    E removeLast() {
        if (size == 0) {
            return null;
        }
        rear = (rear - 1 + capacity) % capacity;
        E value = arr[rear];
        size--;
        return value;
    }


    void addLast(E value) {
        checkCapacity();
        arr[rear] = value;
        rear = (rear + 1) % capacity;
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
