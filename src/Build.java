import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Build {
    public static void main(String[] args) {
        String fileName = "data.txt";
        Map<String, Set<String>> map = new HashMap<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                String key = scanner.next();
                Set<String> values = new HashSet<>();
                while (scanner.hasNext()) {
                    String value = scanner.next();
                    if (value.equals("***")) {
                        break;
                    }
                    values.add(value);
                }

                if (map.containsKey(key)) {
                    System.out.println("Key " + key + " is already in the map, adding values to existing set");
                    Set<String> existingSet = map.get(key);
                    for (String value : values) {
                        if (existingSet.contains(value)) {
                            System.out.println(value + " is already in " + key + "'s set");
                        } else {
                            existingSet.add(value);
                        }
                    }
                } else {
                    map.put(key, values);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Map contents:");
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

    
