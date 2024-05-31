public class Size {
    public static <E> int size(Node<E> head) {
        Node<E> header = head;
        int count = 0;
        while (header != null) {
            count++;
            header = header.next;
        }
        return count;
    }
}