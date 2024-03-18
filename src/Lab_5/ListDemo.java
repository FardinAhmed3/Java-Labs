import java.util.LinkedList;

import java.util.Random;
//Lab 5.11 List Demo

public class ListDemo{
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        
        System.out.println("========== List ==========");
        System.out.println("size: "+list.size());
        System.out.println(list+" ("+(list.isEmpty())+")");
        System.out.println();


        System.out.println("Appending (Adding at end - value @ index)"); 
        System.out.println("-----------------------------------------");

        // for(int i=0;i<=100;i+=10){
        //     list.add("Str"+i);
        //     System.out.println("Str"+i);
        // }
        for(int i=0;i<10;i++){
            int temp=i*10;
            list.add("Str"+temp);
            System.out.println("Str"+temp+" @ "+i+" -> "+list+" ("+list.isEmpty()+")");
        }

        System.out.println();
        System.out.println("Getting");
        System.out.println("------");

        // for (int i=0;i<10;i++){
        //     System.out.print(list.get(i)+", ");

        // }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", "); 
            }
        }

        System.out.println();
        System.out.println("Inserting within the List (value @ index)");
        System.out.println("-----------------------------------------");


}
}


        // for(int i=0;i<10;i++){
        //     int randomNumber=num.nextInt(1000);
        //     sPQ.add("Str"+randomNumber);
        //     System.out.println("Str"+randomNumber+" -> "+sPQ+" ("+sPQ.isEmpty()+")");
        // }



    //     System.out.println();
    //     System.out.println("Removing");
    //     System.out.println("--------");


    //     while (!sPQ.isEmpty()) {
    //         System.out.print(sPQ + " (" + sPQ.isEmpty() + ")");
    //         System.out.println(" -> " + sPQ.remove());
    // }
    //     System.out.println(sPQ+" ("+sPQ.isEmpty()+")");