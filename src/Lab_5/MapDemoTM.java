import java.util.TreeMap;

//Lab 5.16 Map Demo using Tree Map
// .containsKey() 
// .getOrDefault() 
public class MapDemoTM {
    public static void main(String[] args) {
        
        TreeMap<String,Integer> map=new TreeMap<>();
        System.out.println("========== Map ==========");
        System.out.println("Putting");

        for (int i=10;i<20;i++){
            String key="Str"+i;
            map.put(key,i*i);
            System.out.println("("+key+": "+map.get(key)+") -> "+map);
        }

       System.out.println();
       System.out.println("Getting");
       System.out.println();

       for (int i=5;i<25;i++){
            String key="Str"+i;
            if(map.containsKey(key)){
                System.out.println(key + " maps to "+map.get(key)+" in the map");
            }
            else{
                System.out.println(key+ " is not in the map");
            }

       }
       System.out.println();
       System.out.println("Removing");

       for (int i=10;i<20;i++){
        String key="Str"+i;
        map.remove(key);
        System.out.println(key+" -> "+map);
       }


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
Str12·maps to 144 in the map
Str13 maps to 169 in the map
Str14 maps to 196 in the map
Str15 maps to 225 in the map
Str16 maps to 256 in the map
Str17 maps to 289 in the map
Str18 maps to 324 in the map
Str19 maps to 361 in the map
Str20 is not in the map
Str21 is not in the map
Str22 is not in the map
Str23 is not in the map
Str24 is not in the map

Removing↵
Str10·->·{Str18=324,·Str19=361,·Str11=121,·Str12=144,·Str13=169,·Str14=196,·Str15=225,·Str16=256,·Str17=289}↵
Str11·->·{Str18=324,·Str19=361,·Str12=144,·Str13=169,·Str14=196,·Str15=225,·Str16=256,·Str17=289}↵
Str12·->·{Str18=324,·Str19=361,·Str13=169,·Str14=196,·Str15=225,·Str16=256,·Str17=289}↵
Str13·->·{Str18=324,·Str19=361,·Str14=196,·Str15=225,·Str16=256,·Str17=289}↵
Str14·->·{Str18=324,·Str19=361,·Str15=225,·Str16=256,·Str17=289}↵
Str15·->·{Str18=324,·Str19=361,·Str16=256,·Str17=289}↵
Str16·->·{Str18=324,·Str19=361,·Str17=289}↵
Str17·->·{Str18=324,·Str19=361}↵
Str18·->·{Str19=361}↵
Str19·->·{}↵*/