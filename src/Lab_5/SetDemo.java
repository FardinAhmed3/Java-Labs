import java.util.HashSet;


//Lab 5.13 (Set Demo using HashSet)

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> Set=new HashSet<>();
        System.out.println("========= Set ==========");
        System.out.println(Set+" ("+Set.isEmpty()+")");
        System.out.println();

        System.out.println("Adding");
        System.out.println("------");
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
 */