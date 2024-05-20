//Lab 8.04 Singly-Linked, Linear, Two Pointer, Header SC1N

public class SC1N {
    public E removeLast() {
        if (isEmpty()) throw new CollectionException("Deque", "removeLast", "empty container");
        var node = tail.next;
        if (tail.next == tail) {
            tail = null;
        } else {
            while (node.next != tail) {
                node = node.next;
            }
            node.next = tail.next;
            tail = node;
        }
        return node.next.data;
    }
    
}
