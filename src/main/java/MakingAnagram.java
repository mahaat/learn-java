import java.util.HashMap;
import java.util.Map;

public class MakingAnagram {
    static int makeAnagram(String a, String b) {
        int result = 0;
        Map<String, Integer> mapA = new HashMap<String, Integer>();
        Map<String, Integer> mapB = new HashMap<String, Integer>();

        String[] listCharacterA = a.split("");
        String[] listCharacterB = b.split("");

        for (int i = 0; i < listCharacterA.length; i++) {
            if (null != mapA.get(listCharacterA[i])) {
                Integer count = mapA.get(listCharacterA[i]);
                mapA.put(listCharacterA[i], count + 1);
            } else {
                mapA.put(listCharacterA[i], 1);
            }
        }

        for (int i = 0; i < listCharacterB.length; i++) {
            if (null != mapB.get(listCharacterB[i])) {
                Integer count = mapB.get(listCharacterB[i]);
                mapB.put(listCharacterB[i], count + 1);
            } else {
                mapB.put(listCharacterB[i], 1);
            }
        }



        return result;
    }
}
