import java.util.ArrayList;

//Lab 5.12 List Demo using ArrayList

public class ListDemoAL{
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        
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

        for(int i=list.size()-1;i>=0;i--){
            String element= list.get(i);
            if (element.compareTo("Str1000")<0){
                System.out.println(list+ " ("+list.isEmpty()+")"+" -> "+element+" @ "+i);
                list.remove(i);
            }

        }
        System.out.println(list);
        }
}

