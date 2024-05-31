public class StackSearch{

    static <E> boolean search(Stack<E> stack, E e) {
            Stack<E> tempStack = new Stack<>();
            boolean found = false;
    
            while (!stack.isEmpty()) {
                E element = stack.pop();
                if (element.equals(e)) {
                    found = true;
                }
                tempStack.push(element);
            }
    
            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }
    
            return found;
        }
    }