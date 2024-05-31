public class SumEvens {
    public static int sumEvens(Map<String, Integer> map) {
        int sum = 0;

        for (String key : map.keySet()) {
            if (key.length() % 2 == 0) {
                sum += map.get(key);
            }
        }
        return sum;
    }
}
