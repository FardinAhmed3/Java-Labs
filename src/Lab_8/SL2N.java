// Lab 8.03 Singly Linked Linear 2 Pointers No Header SL2N
public class SL2N {
    public E removeLast() {
        if (isEmpty()) throw new CollectionException("Deque", "removeLast", "empty container");
        if (head == tail) {
            var data = head.data;
            head = tail = null;
            return data;
        }
        Node<E> current = head;
        while (current.next != tail) {
            current = current.next;
        }
        var data = tail.data;
        tail = current;
        tail.next = null;
        return data;
    }
    

}
