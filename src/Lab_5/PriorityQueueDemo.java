import java.util.PriorityQueue;

public class PriorityQueueDemo{
    public static void main(String[] args) {
        PriorityQueue<String> s= new PriorityQueue<>();
        s.add("string1");

        for (int i=0; i<=20;i++){
        s.add("string"+i);

        }
        System.out.println(s);
    }
}