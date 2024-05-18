interface Deque<E> {
    void addFirst(E value);
    void addLast(E value);
    E removeFirst();
    E removeLast();
    int size();
    boolean isEmpty();
    int capacity();
}