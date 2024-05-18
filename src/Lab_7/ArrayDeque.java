public class ArrayDeque<E> implements Deque<E> {
    private static final int INITIAL_CAPACITY = 5;
    private Object[] array;
    private int front;
    private int rear;
    private int size;

    public ArrayDeque() {
        array = new Object[INITIAL_CAPACITY];
        front = 0;
        rear = array.length-1;
        size = 0;
    }

    @Override
    public void addFirst(E value) {
        checkCapacity();
        front = (front - 1 + capacity()) % capacity();
        array[front] = value;
        if (size == 0) {
            rear = front;
        }
        size++;
    }

    @Override
    public void addLast(E value) {
        checkCapacity();
        array[rear] = value;
        rear = (rear + 1) % capacity();
        size++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E removeFirst() {
        if (isEmpty()) {
            throw new CollectionException("ArrayDeque", "removeFirst", "Deque is empty");
        }
        E value = (E) array[front];
        array[front] = null;
        front = (front + 1) % capacity();
        size--;
        if (size == 0) {
            front = 0;
            rear = 0;
        }
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E removeLast() {
        if (isEmpty()) {
            throw new CollectionException("ArrayDeque", "removeLast", "Deque is empty");
        }
        rear = (rear - 1 + capacity()) % capacity();
        E value = (E) array[rear];
        array[rear] = null;
        size--;
        if (size == 0) {
            front = 0;
            rear = 0;
        }
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int capacity() {
        return array.length;
    }

    private void checkCapacity() {
        if (size == capacity()) {
            int newCapacity = capacity() * 2;
            Object[] newArray = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[(front + i) % capacity()];
            }
            array = newArray;
            front = 0;
            rear = size;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for (int i = 0; i < size; i++) {
            result.append(array[(front + i) % capacity()]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append("}");
        return result.toString();
    }
}
