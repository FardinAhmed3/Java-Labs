//Lab 8.04 Singly-Linked, Linear, Two Pointer, Header SC1N
//Naming in CL is wrong, its  Singly Linked Linear Two Pointer (Head/Tail) with Header node (SL2H)

public class SC1N {
    public E removeLast() {
        if (isEmpty()) throw new CollectionException("Deque", "removeLast", "empty container");
        if (header.next == tail) return removeFirst();
        Node<E> current = header;
        while (current.next != tail) {
            current = current.next;
        }
        E data = tail.data;
        tail = current;
        tail.next = null;
        return data;
    }
    
    
}
