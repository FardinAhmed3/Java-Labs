//Lab 8.07 Doubly Linked Linear 1 Pointer Header DL1H

public class DL1H {
    public E removeLast() {
        if (isEmpty()) throw new CollectionException("Deque", "removeLast", "empty container");
        Node<E> p = header;
        while (p.next != null) {
            p = p.next;
        }
        if (p.prev != header) {
            p.prev.next = null;
        } else {
            header.next = null;
        }
        return p.data;
    }
     
}
