import java.util.TreeSet;
import java.util.Random;


//Lab 5.14 (Set Demo using TreeSet)


public class SetDemoTS {
    public static void main(String[] args) {
        TreeSet<String> Set=new TreeSet<>();
        System.out.println("========== Set ==========");
        System.out.println(Set+" ("+Set.isEmpty()+")");
        System.out.println();

        System.out.println("Adding");
        System.out.println("------");
        
        for(int i=0;i<100;i+=10){
            Set.add("Str"+i);
            System.out.println("Str"+i+" -> "+Set+" ("+Set.isEmpty()+")");
        }
        System.out.println("Adding again");
        System.out.println("------------");

        for(int i=0;i<100;i+=10){
            Set.add("Str"+i);
            System.out.println("Str"+i+" -> "+Set+" ("+Set.isEmpty()+")");
        }
        System.out.println();

        System.out.println("Membership testing");
        System.out.println("------------------");

        for(int i=0;i<200;i+=10){
            System.out.println("Str"+i+": "+Set.contains("Str"+i));
        }
        System.out.println();

        System.out.println("Removing"); 
        System.out.println("--------");

        Random random = new Random(12345);
        while(!Set.isEmpty()){
            int randomNumber=random.nextInt(10);
            String temp="Str"+randomNumber*10;

            if(Set.contains(temp)){
                 System.out.println(Set+" ("+Set.isEmpty()+") -> "+temp);
                 Set.remove(temp);
            }
        }
        System.out.println(Set+" ("+Set.isEmpty()+")");
         
    }
}