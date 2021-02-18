import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyQuery {
    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        List<Integer> results = new ArrayList<Integer>();
        for (int i = 0; i < queries.size(); i++) {
            List<Integer> query = queries.get(i);
            switch (query.get(0)) {
                case 1: {
                    Integer data = query.get(1);
                    Integer freq = freqMap.get(data);
                    if (null == freq) {
                        freqMap.put(data, 1);
                    } else {
                        freqMap.put(data, freq + 1);
                    }
                    break;
                }
                case 2: {
                    Integer data = query.get(1);
                    Integer freq = freqMap.get(data);
                    if (null != freq && freq > 0) {
                        freqMap.put(data, freq - 1);
                    }
                    break;
                }
                case 3: {
                    Integer data = query.get(1);
                    if (freqMap.containsValue(data)) {
                        results.add(1);
                    } else {
                        results.add(0);
                    }
                    break;
                }
            }
        }

        return results;
    }
}
