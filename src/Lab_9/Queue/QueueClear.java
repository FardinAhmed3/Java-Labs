public class QueueClear {
    static <E> void clear(Queue<E> queue) {
        while (!queue.isEmpty()) {
            queue.remove();
        }
    }
}