package Lab_5;

import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueDemo{
    public static void main(String[] args) {
        PriorityQueue<String> sPQ= new PriorityQueue<>();
        System.out.println("=======PriorityQueue=======");
        System.out.println(sPQ+" ("+(sPQ.isEmpty())+")");
        System.out.println();



        for(int i=0;i<10;i++){
            Random num=new Random(12345);
        int randomNumber=num.nextInt(1000);
        sPQ.add("String"+randomNumber);
        //sPQ.add("String"+i);
        }

        System.out.println(sPQ);
    }
}