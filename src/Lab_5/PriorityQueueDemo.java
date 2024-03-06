import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueDemo{
    public static void main(String[] args) {
        PriorityQueue<String> sPQ= new PriorityQueue<>();
        System.out.println("=======PriorityQueue=======");
        System.out.println(sPQ+" ("+(sPQ.isEmpty())+")");
        System.out.println();

        Random num=new Random(12345);

        for(int i=0;i<1000;i++){
        int randomNumber=num.nextInt(1000);
        sPQ.add("String"+randomNumber);
        }

        System.out.println(sPQ);
    }
}