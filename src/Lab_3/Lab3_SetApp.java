import java.util.Set;
import java.util.HashSet;
import java.util.Random;

public class SetApp {

    public static void allMethods(Set<Integer> set) {
        basics(set);
        generics();
        elementOrder();
    }

    static void basics(Set<Integer> set) {
        System.out.println("=== Basic Functionality ===\n");

        System.out.println("--- Creating a Set<Integer> and printing it and its initial stats ---");
        System.out.println(set + " (" + set.size() + ")\n");

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
    System.out.println("=== Generics ===\n");

    Set<Double> doubleSet = new HashSet<>();
    for (double i = 0; i < 10; i ++) {
        doubleSet.add(i);
    }
    System.out.println("--- Set<Double> ---");
    System.out.println(doubleSet + "\n");

    Set<String> stringSet = new HashSet<>();
    for (int i = 0; i < 7; i++) {
        stringSet.add("Str" + i);
    }
    System.out.println("--- Set<String> ---");
    System.out.println(stringSet + "\n");
    System.out.println();
    }
    static void elementOrder() {
    System.out.println("=== Element Order ===\n");

    Random random = new Random(12345);
    Set<Integer> hashSet = new HashSet<>();
    System.out.println("--- Adding 10 random values to a Set<Integer> using a Random object with seed=12345 ---");
    for (int i = 0; i < 10; i++) {
        int value = random.nextInt(100);
        hashSet.add(value);
        System.out.println("adding " + value + " -> " + hashSet);
    }
    System.out.println(hashSet + "");
    }
}