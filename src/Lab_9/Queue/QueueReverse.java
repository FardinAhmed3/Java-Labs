public class QueueReverse {
    public static <E> void reverse(Queue<E> queue) {
        Stack<E> stack = new Stack<>();

        while(!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while(!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}