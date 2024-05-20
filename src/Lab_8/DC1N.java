//Lab 8.10 Doubly-Linked Circular 1 Pointer Header DC1H

public class DC1N {
    public E removeLast() {
        if (isEmpty()) throw new CollectionException("Deque", "removeLast", "empty container");
        var node = head.prev;
        if (head.next == head) {
            head = null;
        } else {
            node.prev.next = head;
            head.prev = node.prev;
        }
        return node.data;
    }
        
}
