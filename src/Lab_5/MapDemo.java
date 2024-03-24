import java.util.HashMap;

//Lab 5.15 HashMap

public class MapDemo {
    public static void main(String[] args) {
        
        HashMap<String,Integer> map=new HashMap<>();
        System.out.println("========== Map ==========");
        System.out.println("Putting");

        for (int i=10;i<20;i++){
            String key="Str"+i;
            map.put(key,i*i);
            System.out.println(key);

        }
        //System.out.println(map);



    }
}

/*==========·Map·==========↵
Putting↵
(Str10:·100)·->·{Str10=100}↵
(Str11:·121)·->·{Str10=100,·Str11=121}↵
(Str12:·144)·->·{Str10=100,·Str11=121,·Str12=144}↵
(Str13:·169)·->·{Str10=100,·Str11=121,·Str12=144,·Str13=169}↵
(Str14:·196)·->·{Str10=100,·Str11=121,·Str12=144,·Str13=169,·Str14=196}↵
(Str15:·225)·->·{Str10=100,·Str11=121,·Str12=144,·Str13=169,·Str14=196,·Str15=225}↵
(Str16:·256)·->·{Str10=100,·Str11=121,·Str12=144,·Str13=169,·Str14=196,·Str15=225,·Str16=256}↵
(Str17:·289)·->·{Str10=100,·Str11=121,·Str12=144,·Str13=169,·Str14=196,·Str15=225,·Str16=256,·Str17=289}↵
(Str18:·324)·->·{Str18=324,·Str10=100,·Str11=121,·Str12=144,·Str13=169,·Str14=196,·Str15=225,·Str16=256,·Str17=289}↵
(Str19:·361)·->·{Str18=324,·Str19=361,·Str10=100,·Str11=121,·Str12=144,·Str13=169,·Str14=196,·Str15=225,·Str16=256,·Str17=289}↵
↵
Getting↵
↵
Str5·is·not·in·the·map↵
Str6·is·not·in·the·map↵
Str7·is·not·in·the·map↵
Str8·is·not·in·the·map↵
Str9·is·not·in·the·map↵
Str10·maps·to·100·in·the·map↵
Str11·maps·to·121·in·the·map↵
Str12·ma... */