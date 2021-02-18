import java.util.HashMap;
import java.util.Map;

public class TwoStrings {
    static String twoStrings(String s1, String s2) {
        String result = "NO";
        Map<Character, Integer> s1CharMap = new HashMap<>();

        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();

        for (int i = 0; i < s1Chars.length; i++) {
            char curChar = s1Chars[i];
            if (s1CharMap.containsKey(curChar)) {
                Integer freq = s1CharMap.get(curChar);
                s1CharMap.put(curChar, freq + 1);
            } else {
                s1CharMap.put(curChar, 1);
            }
        }

        for (int i = 0; i < s2Chars.length; i++) {
            char curChar = s2Chars[i];
            if (s1CharMap.containsKey(curChar)) {
                result = "YES";
                break;
            }
        }

        return result;
    }
}
