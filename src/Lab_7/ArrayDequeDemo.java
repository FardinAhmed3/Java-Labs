public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> AD=new ArrayDeque<>();
    //AD.addFirst(4);

    for(int i=0;i<10;i++){
        AD.addFirst(i);
    }

    for(int i=0;i<10;i++){
        AD.addLast(i);
    }
    // for(int i=0;i<10;i++){
    //     AD.addLast(i);
    // }
    System.out.println(AD);
    System.out.println(AD.contains(9));

}
}
