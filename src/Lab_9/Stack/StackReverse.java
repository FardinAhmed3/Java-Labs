public class StackReverse{

    static <E> void reverse(Stack<E> stack) {
            if (stack.isEmpty()) {
                return;
            }
            E element = stack.pop();
            reverse(stack);
            insertAtBottom(stack, element);
        }
    
        private static <E> void insertAtBottom(Stack<E> stack, E element) {
            if (stack.isEmpty()) {
                stack.push(element);
            } else {
                E top = stack.pop();
                insertAtBottom(stack, element);
                stack.push(top);
            }
        }
    }