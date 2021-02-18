import java.util.HashMap;
import java.util.Map;

public class IceCreamParlor {
    static int[] icecreamParlor(int m, int[] arr) {
        Map<Integer, Integer> priceMap = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            int cost = arr[i];

            if ( priceMap.containsKey(m - cost)) {
                int iceCream1 = i + 1;
                int iceCream2 = priceMap.get(m - cost) + 1;

                if ( iceCream1 == iceCream2) {
                    continue;
                }

                if (iceCream1 < iceCream2 ){
                    result[0] = iceCream1;
                    result[1] = iceCream2;
                    break;
                } else {
                    result[0] = iceCream2;
                    result[1] = iceCream1;
                    break;
                }
            }

            priceMap.put(cost, i);
        }

        return result;
    }
}
