//Lab 8.02 Singly-Linked, Linear, One Pointer, header SL1H

public class SL1H {
    public E removeLast() {
        if (isEmpty()) throw new CollectionException("Deque", "removeLast", "empty container");
    
        if (header.next.next == null) {
            return removeFirst();
        }
    
        Node<E> p = header.next;
        while (p.next.next != null) {
            p = p.next;
        }
    
        E data = p.next.data;
        p.next = null;
        return data;
    }
    
}
