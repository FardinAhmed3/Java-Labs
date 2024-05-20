//Lab 8.06 Doubly Linked Linear 1 Pointer No Header DL1N

public class DL1N {
    public E removeLast() {
        if (isEmpty()) throw new CollectionException("Deque", "removeLast", "empty container");
        Node<E> p = head;
        if (p.next == null) {
            head = null;
            return p.data;
        }
        while (p.next != null) {
            p = p.next;
        }
        p.prev.next = null;
        return p.data;
    }
    

}
