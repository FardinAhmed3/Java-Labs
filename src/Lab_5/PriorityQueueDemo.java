import java.util.PriorityQueue;
import java.util.Random;

// Lab 5.1

public class PriorityQueueDemo{
    public static void main(String[] args) {
        PriorityQueue<String> sPQ= new PriorityQueue<>();
        
        System.out.println("========== PriorityQueue ==========");
        System.out.println(sPQ+" ("+(sPQ.isEmpty())+")");
        System.out.println();

        Random num=new Random(12345);

        System.out.println("Adding");
        System.out.println("------");

        for(int i=0;i<10;i++){
            int randomNumber=num.nextInt(1000);
            sPQ.add("Str"+randomNumber);
            System.out.println("Str"+randomNumber+" -> "+sPQ+" ("+sPQ.isEmpty()+")");
        }

        System.out.println();
        System.out.println("Removing");
        System.out.println("--------");

        // for(int i=0;i<4;i++){
        //  sPQ.remove();
        //  System.out.println(sPQ+" ("+sPQ.isEmpty()+") "+sPQ.peek());
        // }

        while (!sPQ.isEmpty()) {
            System.out.print(sPQ + " (" + sPQ.isEmpty() + ")");
            System.out.println(" -> " + sPQ.remove());
    }
        System.out.println(sPQ+" ("+sPQ.isEmpty()+")");
}
}
