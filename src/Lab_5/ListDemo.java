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
        list.add(0, "Str"+0);
        System.out.println("Str0 @ 0 -> "+list+" ("+list.isEmpty()+")");
        System.out.println();
        System.out.println("Removing elements < Str1000");
        System.out.println("------------------------");
        Random random= new Random(12345);

         for(int i=9;i>0;i--){
            //int temp2=random.nextInt(10);
           // System.out.println(temp2);
             int temp=i*1000;
             list.remove("Str"+temp);
             //System.out.println("Str"+temp+" @ "+i+" -> "+list+" ("+list.isEmpty()+")");
             System.out.println(list+ " ("+list.isEmpty()+")"+" -> "+"Str"+temp+" @ "+i);
            }






}
}

/*
 * 4000,·Str40,·Str5000,·Str50,·Str6000,·Str60,·Str7000,·Str70,·Str8000,·Str80,·Str9000,·Str90]·(false)↵
Str0·@·0·->·[Str0,·Str0,·Str1000,·Str10,·Str2000,·Str20,·Str3000,·Str30,·Str4000,·Str40,·Str5000,·Str50,·Str6000,·Str60,·Str7000,·Str70,·Str8000,·Str80,·Str9000,·Str90]·(false)↵
↵
Removing·elements·<·Str1000↵
------------------------↵
[Str0,·Str0,·Str1000,·Str10,·Str2000,·Str20,·Str3000,·Str30,·Str4000,·Str40,·Str5000,·Str50,·Str6000,·Str60,·Str7000,·Str70,·Str8000,·Str80,·Str9000,·Str90]·(false)·->·Str10·@·3↵
[Str0,·Str0,·Str1000,·Str2000,·Str20,·Str3000,·Str30,·Str4000,·Str40,·Str5000,·Str50,·Str6000,·Str60,·Str7000,·Str70,·Str8000,·Str80,·Str9000,·Str90]·(false)·->·Str0·@·1↵
[Str0,·Str1000,·Str2000,·Str20,·Str3000,·Str30,·Str4000,·Str40,·Str5000,·Str50,·Str6000,·Str60,·Str7000,·Str70,·Str8000,·Str80,·Str9000,·Str90]·(false)·->·Str0·@·0↵
[Str1000,·Str2000,·Str20,·Str3000,·Str30,·Str4000,·Str40,·Str5000,·Str50,·Str6000,·Str60,·Str7000,·Str70,·Str8000,·Str80,·Str9000,·Str90]↵
 */