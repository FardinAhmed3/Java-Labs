//Lab 8.05 Singly-Linked, Circular, One Pointer (Tail) No header

public class SC1N1 {
    public E removeLast() {
        if (isEmpty()) throw new CollectionException("Deque", "removeLast", "empty container");
        Node<E> current = tail.next;
        Node<E> prev = tail;
    
        if (current == tail) {
            tail = null;
            return current.data;
        }
    
        while (current.next != tail) {
            current = current.next;
        }
    
        E data = tail.data;
        current.next = tail.next;
        tail = current;
        
        return data;
    }
    
}
