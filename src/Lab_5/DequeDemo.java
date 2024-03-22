import java.util.ArrayDeque;

// Lab 5.2 Deque using ArrayDeque
public class DequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> arrDeq=new ArrayDeque<>();

        System.out.println("========== Deque ==========");
        System.out.println(arrDeq+" ("+arrDeq.isEmpty()+")");
        System.out.println();

        System.out.println("Adding First and Last Alternately");
        System.out.println("------");
        
        for (int i=0; i<100;i+=10){
            String temp="Str"+i;

            arrDeq.addFirst(temp);
            System.out.println("Str"+i+" -> "+arrDeq+" ("+arrDeq.isEmpty()+")");

            arrDeq.addLast(temp);
            System.out.println("Str"+i+" -> "+arrDeq+" ("+arrDeq.isEmpty()+")");
        
        }

        System.out.println();

        System.out.println("Removing First and Last Alternately");
        System.out.println("-----------------------------------");

         for (int i=90;i>=0;i-=10){
            //Remove first
            System.out.println(arrDeq+" ("+arrDeq.isEmpty()+")"+" -> Str"+i);
            arrDeq.removeFirst();

            //Remove Last
            System.out.println(arrDeq+" ("+arrDeq.isEmpty()+")"+" -> Str"+i);
            arrDeq.removeLast();
        }
        System.out.println(arrDeq+" ("+arrDeq.isEmpty()+")");

        System.out.println(arrDeq + " (" + arrDeq.isEmpty() + ")");
    }
}

/*EXPECTED OUTPUT --> FOLLOWING EXAMPLE USES INTEGER INSTEAD OF STRING APPENDS::
 * 
 * ========== Deque ==========
{} (true)

Adding First and Last Alternately
---------------------------------
0 -> {0} (false)
0 -> {0, 0} (false)
10 -> {10, 0, 0} (false)
10 -> {10, 0, 0, 10} (false)
20 -> {20, 10, 0, 0, 10} (false)
20 -> {20, 10, 0, 0, 10, 20} (false)
30 -> {30, 20, 10, 0, 0, 10, 20} (false)
30 -> {30, 20, 10, 0, 0, 10, 20, 30} (false)
40 -> {40, 30, 20, 10, 0, 0, 10, 20, 30} (false)
40 -> {40, 30, 20, 10, 0, 0, 10, 20, 30, 40} (false)
50 -> {50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40} (false)
50 -> {50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50} (false)
60 -> {60, 50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50} (false)
60 -> {60, 50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50, 60} (false)
70 -> {70, 60, 50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50, 60} (false)
70 -> {70, 60, 50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50, 60, 70} (false)
80 -> {80, 70, 60, 50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50, 60, 70} (false)
80 -> {80, 70, 60, 50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50, 60, 70, 80} (false)
90 -> {90, 80, 70, 60, 50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50, 60, 70, 80} (false)
90 -> {90, 80, 70, 60, 50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50, 60, 70, 80, 90} (false)

Removing First and Last Alternately
-----------------------------------
{90, 80, 70, 60, 50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50, 60, 70, 80, 90} (false) -> 90
{80, 70, 60, 50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50, 60, 70, 80, 90} (false) -> 90
{80, 70, 60, 50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50, 60, 70, 80} (false) -> 80
{70, 60, 50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50, 60, 70, 80} (false) -> 80
{70, 60, 50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50, 60, 70} (false) -> 70
{60, 50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50, 60, 70} (false) -> 70
{60, 50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50, 60} (false) -> 60
{50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50, 60} (false) -> 60
{50, 40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50} (false) -> 50
{40, 30, 20, 10, 0, 0, 10, 20, 30, 40, 50} (false) -> 50
{40, 30, 20, 10, 0, 0, 10, 20, 30, 40} (false) -> 40
{30, 20, 10, 0, 0, 10, 20, 30, 40} (false) -> 40
{30, 20, 10, 0, 0, 10, 20, 30} (false) -> 30
{20, 10, 0, 0, 10, 20, 30} (false) -> 30
{20, 10, 0, 0, 10, 20} (false) -> 20
{10, 0, 0, 10, 20} (false) -> 20
{10, 0, 0, 10} (false) -> 10
{0, 0, 10} (false) -> 10
{0, 0} (false) -> 0
{0} (false) -> 0
{} (true)
 */