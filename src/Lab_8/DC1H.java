//Lab 8.11 Doubly-Linked Circular 1 Pointer Header DC1H

public class DC1H {
    public E removeLast() {
        if (isEmpty()) throw new CollectionException("Deque", "removeLast", "empty container");
        var node = header.prev;
        node.prev.next = header;
        header.prev = node.prev;
        return node.data;
    }
    
}
