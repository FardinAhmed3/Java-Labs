public class ArrayDequeDemo {
    public static void main(String [] args) {
        DequeDemo.basics(new ArrayDeque<Object>());
        DequeDemo.capacityManagement(new ArrayDeque<Object>());
        DequeDemo.exceptionHandling(new ArrayDeque<Object>());
        DequeDemo.generics(new ArrayDeque<Integer>(), new ArrayDeque<String>());
    }
}
