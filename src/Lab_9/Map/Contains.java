public class Contains {
    public static String contains(Map<String, Set<Integer>> map, Integer value) {
        for (String key : map.keySet()) {
            Set<Integer> set = map.get(key);
            if (set.contains(value)) {
                return key;
            }
        }
        return null;
    }
}