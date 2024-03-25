import java.util.ArrayList;

//Lab 5.7 StackDemo using ArrayList

public class StackDemoAL {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        String ar=" -> ";
        System.out.println("========== Stack ==========");
        System.out.println(list+" ("+list.isEmpty()+")");

        System.out.println();
        
        System.out.println("Pushing");
        System.out.println("-------");
        for (int i=0;i<100;i+=10){
            list.add("Str"+i);
            System.out.println("Str"+i+ar+list+" ("+list.isEmpty()+")");

        }

        System.out.println();

        System.out.println("Popping");
        System.out.println("-------");

        for(int i=90;i>=0;i-=10){
            String temp="Str"+i;
            System.out.println(list+" ("+list.isEmpty()+") -> Str"+i);
            list.remove(temp);
        }
        System.out.println(list+" ("+list.isEmpty()+")");
    }
}
