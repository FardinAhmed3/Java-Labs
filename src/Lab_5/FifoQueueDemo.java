import java.util.ArrayDeque;

//Lab 5.8 FIFO Queue Demo usign ArrayDeque
public class FifoQueueDemo {
    public static void main(String[] args) {
        ArrayDeque<String> ad=new ArrayDeque<>();

        System.out.println("========== FifoQueue ==========");
        System.out.println(ad+" ("+ad.isEmpty()+")");

        System.out.println();
        System.out.println("------");

        for (int i=0;i<100;i+=10){
            String temp="Str"+i;
            ad.add(temp);
            System.out.println(temp+" -> "+ad+" ("+ad.isEmpty()+")");
        }



    }
}
