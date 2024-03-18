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


        System.out.println("Appending (adding at end - value @ index)"); 
        System.out.println("-----------------------------------------");

        for(int i=0;i<10;i++){
            int temp=i*10;
            list.add("Str"+temp);
            System.out.println("Str"+temp+" @ "+i+" -> "+list+" ("+list.isEmpty()+")");
        }

        System.out.println();
        System.out.println("Getting");
        System.out.println("-------");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", "); 
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Inserting within the List (value @ index)");
        System.out.println("-----------------------------------------");
        for(int i=9;i>0;i--){
        int temp=i*1000;
        list.add(i, "Str"+temp);
        System.out.println("Str"+temp+" @ "+i+" -> "+list+" ("+list.isEmpty()+")");
        }
        System.out.println();
        System.out.println("Removing elements < Str1000");
        System.out.println("------------------------");
        


}
}