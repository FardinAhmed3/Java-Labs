// Lab 8.01 SL1N Singly Linear 1 Pointer No Header

public class SL1N{
public E removeLast() {
    if (isEmpty()) throw new CollectionException("Deque", "removeLast", "empty container");

    if (head.next == null) {
        return removeFirst();
    }

    Node<E> p = head;
    while (p.next.next != null) {
        p = p.next;
    }
    
    E data = p.next.data;
    p.next = null;
    return data;
}

}