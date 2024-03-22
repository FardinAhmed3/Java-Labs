import java.util.ArrayDeque;

//Lab 5.5 StackDemo

public class StackDemo {
    public static void main(String[] args) {
        ArrayDeque<String> arrDeq=new ArrayDeque<>();
        String ar=" -> ";
        System.out.println("========== Stack ==========");
        System.out.println(arrDeq+" ("+arrDeq.isEmpty()+")");

        System.out.println();
        
        System.out.println("Pushing");
        System.out.println("-------");
        for (int i=0;i<100;i+=10){
            arrDeq.addFirst("Str"+i);
            System.out.println("Str"+i+ar+arrDeq+" ("+arrDeq.isEmpty()+")");

        }

        System.out.println();

        System.out.println("Popping");
        System.out.println("-------");

        for(int i=90;i>=0;i-=10){
            System.out.println(arrDeq+" ("+arrDeq.isEmpty()+") -> Str"+i);
            arrDeq.removeFirst();
        }
        System.out.println(arrDeq+" ("+arrDeq.isEmpty()+")");
    }
}
