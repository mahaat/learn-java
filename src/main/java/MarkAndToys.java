import java.util.ArrayList;
import java.util.List;

// Implemented with Selection Sort
public class MarkAndToys {
    static int maximumToys(int[] prices, int k) {
        List<Integer> minArr = new ArrayList<Integer>();
        int maxToys = 0;

        for (int i = 0; i < prices.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < prices.length; j++) {
                if ( prices[j] < prices[minIdx]) {
                    minIdx = j;
                }
            }

            // swap
            int temp = prices[minIdx];
            prices[minIdx] = prices[i];
            prices[i] = temp;

            minArr.add(temp);

            int totalCost = 0;
            for (int i1 : minArr) {
                totalCost += i1;
            }

            if (k - totalCost >= 0) {
                maxToys = minArr.size();
                continue;
            } else {
                break;
            }
        }

        return maxToys;
    }
}
