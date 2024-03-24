import java.util.ArrayList;

//Lab 5.7 StackDemo using ArrayList

public class StackDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        String ar=" -> ";
        System.out.println("========== Stack ==========");
        System.out.println(list+" ("+list.isEmpty()+")");

        System.out.println();
        
        System.out.println("Pushing");
        System.out.println("-------");
        for (int i=0;i<100;i+=10){
            list.addFirst("Str"+i);
            System.out.println("Str"+i+ar+list+" ("+alist.isEmpty()+")");

        }

        System.out.println();

        System.out.println("Popping");
        System.out.println("-------");

        for(int i=90;i>=0;i-=10){
            System.out.println(list+" ("+list.isEmpty()+") -> Str"+i);
            list.removeFirst();
        }
        System.out.println(list+" ("+list.isEmpty()+")");
    }
}
