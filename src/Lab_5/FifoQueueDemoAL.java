import java.util.ArrayList;

//Lab 5.10 FIFO Queue Demo usign ArrayList
public class FifoQueueDemoAL {
    public static void main(String[] args) {
        ArrayList<String> ad=new ArrayList<>();

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
