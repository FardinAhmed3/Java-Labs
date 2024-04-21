import java.util.ArrayDeque;

public class ArrayDeque {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> ad=new ArrayDeque();
        for (int i=0;i<=100;i+=10){
            ad.add(i);
        }

        System.out.println(ad);
        
    }
}
