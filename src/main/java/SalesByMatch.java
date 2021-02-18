import java.util.HashMap;
import java.util.Map;

public class SalesByMatch {
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> sockMap = new HashMap<Integer, Integer>();
        for (int i : ar) {
            if (sockMap.containsKey(i)) {
                Integer currentCount = sockMap.get(i);
                sockMap.put(i, currentCount + 1);
            } else {
                sockMap.put(i, 1);
            }
        }

        int totalSock = 0;
        for (Map.Entry<Integer, Integer> entry: sockMap.entrySet()) {
            int pair = Math.floorDiv(entry.getValue(), 2);
            totalSock += pair;
        }

        return  totalSock;
    }
}
