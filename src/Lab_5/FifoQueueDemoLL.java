import java.util.LinkedList;

//Lab 5.9 FIFO Queue Demo usign LinkedList
public class FifoQueueDemoLL {
    public static void main(String[] args) {
        LinkedList<String> ad=new LinkedList<>();

        System.out.println("========== FifoQueue ==========");
        System.out.println(ad+" ("+ad.isEmpty()+")");

        System.out.println();
        
        System.out.println("Adding");
        System.out.println("------");

        for (int i=0;i<100;i+=10){
            String temp="Str"+i;
            ad.add(temp);
            System.out.println(temp+" -> "+ad+" ("+ad.isEmpty()+")");
        }

        System.out.println();

        System.out.println("Removing");
        System.out.println("--------");
        for (int i=0;i<100;i+=10){
            String temp="Str"+i;
            System.out.println(ad+" ("+ad.isEmpty()+")"+" -> "+temp);
            ad.remove(temp);
        }
        
        System.out.println(ad+" ("+ad.isEmpty()+")");


    }
}
