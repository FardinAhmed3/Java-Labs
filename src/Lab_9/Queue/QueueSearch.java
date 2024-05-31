public class QueueSearch {
    public static <E> boolean search(Queue<E> queue, E value) {
        boolean found = false;
        Queue<E> newQueue = new Queue<E>();

        while(!queue.isEmpty()) {
            if (found == false && queue.peek().equals(value)) found = true;
            newQueue.add(queue.remove());
        }
        while (!newQueue.isEmpty()) {
            queue.add(newQueue.remove());
        }
        return found;
    }
}