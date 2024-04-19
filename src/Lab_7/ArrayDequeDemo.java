public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> ArrayDeque=new ArrayDeque<>();
    ArrayDeque.addFirst(4);

    for(int i=0;i<10;i++){
        ArrayDeque.addFirst(i);
    }
    for(int i=0;i<10;i++){
        ArrayDeque.addLast(i);
    }


    System.out.println(ArrayDeque);

}
}
