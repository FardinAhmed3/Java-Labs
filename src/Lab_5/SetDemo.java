import java.util.HashSet;


//Lab 5.13 (Set Demo using HashSet)

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> Set=new HashSet<>();
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
        System.out.println("Membership Checking");
        System.out.println("------------------");
        for(int i=0;i<200;i+=10){
            System.out.println("Str"+i+": "+Set.contains("Str"+i));
        }
        System.out.println();

        System.out.println("Removing");
        System.out.println("--------");
        System.out.println(Set);
        for(int i=0;i<100;i+=10){
            System.out.println(Set+" ("+Set.contains("Str"+i)+") -> Str"+i);
            Set.remove("Str"+i);

        }
    }

}


/*REQUIRED OUTPUT::
 * ==========·Set·==========↵
[]·(true)↵
↵
Adding↵
------↵
Str0·->·[Str0]·(false)↵
Str10·->·[Str0,·Str10]·(false)↵
Str20·->·[Str20,·Str0,·Str10]·(false)↵
Str30·->·[Str30,·Str20,·Str0,·Str10]·(false)↵
Str40·->·[Str40,·Str30,·Str20,·Str0,·Str10]·(false)↵
Str50·->·[Str50,·Str40,·Str30,·Str20,·Str0,·Str10]·(false)↵
Str60·->·[Str60,·Str50,·Str40,·Str30,·Str20,·Str0,·Str10]·(false)↵
Str70·->·[Str70,·Str60,·Str50,·Str40,·Str30,·Str20,·Str0,·Str10]·(false)↵
Str80·->·[Str80,·Str70,·Str60,·Str50,·Str40,·Str30,·Str20,·Str0,·Str10]·(false)↵
Str90·->·[Str90,·Str80,·Str70,·Str60,·Str50,·Str40,·Str30,·Str20,·Str0,·Str10]·(false)↵
Adding·again↵
------------↵
Str0·->·[Str90,·Str80,·Str70,·Str60,·Str50,·Str40,·Str30,·Str20,·Str0,·Str10]·(false)↵
Str10·->·[Str90,·Str80,·Str70,·Str60,·Str50,·Str40,·Str30,·Str20,·Str0,·Str10]·(false)↵
Str20·->·[Str90,·Str80,·Str70,·Str60,·Str50,·Str40,·Str30,·Str20,·Str0,·Str10]·(false)↵
Str30·->·[Str90,·Str80,·Str70,·Str60,·Str50,·Str40,·Str30,·Str20,·Str0,·Str10]·(false)↵
Str40·->·[Str90,·Str80↵
...tr10]·(false)↵
Str90·->·[Str90,·Str80,·Str70,·Str60,·Str50,·Str40,·Str30,·Str20,·Str0,·Str10]·(false)↵
↵
Membership·testing↵
------------------↵
Str0:·true↵
Str10:·true↵
Str20:·true↵
Str30:·true↵
Str40:·true↵
Str50:·true↵
Str60:·true↵
Str70:·true↵
Str80:·true↵
Str90:·true↵
Str100:·false↵
Str110:·false↵
Str120:·false↵
Str130:·false↵
Str140:·false↵
Str150:·false↵
Str160:·false↵
Str170:·false↵
Str180:·false↵
Str190:·false↵
↵
Removing↵
--------↵
[Str90,·Str80,·Str70,·Str60,·Str50,·Str40,·Str30,·Str20,·Str0,·Str10]·(false)·->·Str10↵
[Str90,·Str80,·Str70,·Str60,·Str50,·Str40,·Str30,·Str20,·Str0]·(false)·->·Str0↵
[Str90,·Str80,·Str70,·Str60,·Str50,·Str40,·Str30,·Str20]·(false)·->·Str80↵
[Str90,·Str70,·Str60,·Str50,·Str40,·Str30,·Str20]·(false)·->·Str50↵
[Str90,·Str70,·Str60,·Str40,·Str30,·Str20]·(false)·->·Str40↵
[Str90,·Str70,·Str60,·Str30,·Str20]·(false)·->·Str20↵
[Str90,·Str70,·Str60,·Str30]·(false)·->·Str90↵
[Str70,·Str60,·Str30]·(false)·->·Str70↵
[Str60,·Str30]·(false)·->·Str60↵
[Str30]·(false)·->·Str30↵
[]·(true)↵
 */