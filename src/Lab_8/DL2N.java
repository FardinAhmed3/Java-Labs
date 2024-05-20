//Lab 8.08 Doubly Linked Linear 2 Pointer with no Header Node

public class DL2N {
    public E removeLast() {
        if (isEmpty()) throw new CollectionException("Deque", "removeLast", "empty container");
        Node<E> node = tail;
        if (tail.prev != null) {
            tail.prev.next = null;
            tail = tail.prev;
        } else {
            head = tail = null;
        }
        return node.data;
    }
    
}
