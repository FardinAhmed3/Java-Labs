//Lab 8.09 Doubly Linked Linear 2 Pointer with Header Node DL2H

public class DL2H {
    public E removeLast() {
        if (isEmpty()) throw new CollectionException("Deque", "removeLast", "empty container");
        Node<E> node = tail;
        if (tail.prev != header) {
            tail.prev.next = null;
            tail = tail.prev;
        } else {
            tail = null;
            header.next = null;
        }
        return node.data;
    }
    
}
