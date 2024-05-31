public class StackClear {
    static <E> void clear(Stack<E> stack) {
        while (!stack.isEmpty()) {
            stack.pop();
        }
    }
}