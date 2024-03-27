import java.util.Set;
import java.util.TreeSet;
import java.util.Random;

public class Lab3_SetApp_P2 {
    public static void allMethods(Set<Integer> set) {
        basic(set);
        generics();
        elementOrder();
    }

    static void basic(Set<Integer> set) {
        System.out.println("=== Basic Functionality ===");
        System.out.println();
        System.out.println("--- Creating a Set<Integer> and printing it and its initial stats ---");
        System.out.println(set + " (" + set.size() + ")");
        System.out.println();

        System.out.println("--- Loading it up to 10 with add ---");
        for (int i = 0; i < 10; i++) {
            set.add(i * 10);
            System.out.println("Adding " + i + " -> " + set + " (" + set.size() + ")");
        }
        System.out.println();

        System.out.println("--- Loading it up with the same elements  ---");
        for (int i = 0; i < 10; i++) {
            set.add(i * 10);
            System.out.println("Adding " + i + " -> " + set + " (" + set.size() + ")");
        }
        System.out.println();

        System.out.println("--- Membership checking  ---");
        for (int i = -50; i <= 140; i += 10) {
            if (!set.contains(i)) {
                System.out.println("set does not contain " + i);
            } else {
                System.out.println("set contains " + i);
            }
        }
        System.out.println();
    }

    static void generics() {
    System.out.println("=== Generics ===");
    System.out.println();
    Set<Double> doubleSet = new TreeSet<>();
    for (double i = 0; i < 10; i += 1.0) {
    doubleSet.add(i);
    }
    
    System.out.println("--- Set<Double> ---");
    System.out.println(doubleSet + "\n");
    
    Set<String> stringSet = new TreeSet<>();
    for (int i = 0; i < 7; i++) {
    stringSet.add("Str" + i);
    }
    
    System.out.println("--- Set<String> ---");
    System.out.println(stringSet + "\n");
    System.out.println();
    }
    
    static void elementOrder() {
    System.out.println("=== Element Order ===");
    System.out.println();
    Random random = new Random(12345);
    Set<Integer> treeSet = new TreeSet<>();
    
    System.out.println("--- Adding 10 random values to a Set<Integer> using a Random object with seed=12345 ---");
    
    for (int i = 0; i < 10; i++) {
    int value = random.nextInt(100);
    treeSet.add(value);
    System.out.println("adding " + value + " -> " + treeSet);
    }
    System.out.println(treeSet + "");
    }
}

