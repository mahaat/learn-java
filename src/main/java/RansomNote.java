import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    static String checkMagazine(String[] magazine, String[] note ) {
        Map<String, Integer> magazineMap = new HashMap<String, Integer>();
        Map<String, Integer> noteMap = new HashMap<String, Integer>();

        for (String s : magazine) {
            if (magazineMap.containsKey(s)) {
                Integer value = (Integer) magazineMap.get(s);
                magazineMap.put(s, value + 1);
            } else {
                magazineMap.put(s, 1);
            }
        }

        for (String s : note) {
            if (noteMap.containsKey(s)) {
                Integer value = (Integer) noteMap.get(s);
                noteMap.put(s, value + 1);
            } else {
                noteMap.put(s, 1);
            }
        }

        for ( Map.Entry<String, Integer>  entry: noteMap.entrySet()) {
            if ( magazineMap.containsKey(entry.getKey())) {
                Integer magazineCount = magazineMap.get(entry.getKey());
                Integer noteCount = noteMap.get(entry.getKey());
                if ( magazineCount.compareTo(noteCount) < 0) {
                    return "No";
                }
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
