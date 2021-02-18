import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarcsCakewalk {
    static long marcsCakewalk(int[] calorie) {
        Double min = 0d;
        List<Integer> listCalorie = new ArrayList<>();


        for (int i = 0; i < calorie.length; i++) {
            listCalorie.add(calorie[i]);
        }

        Collections.sort(listCalorie, Collections.reverseOrder());
        System.out.println(listCalorie);

        for (int i = 0; i < listCalorie.size(); i++) {
            Integer cal = listCalorie.get(i);
            min = cal * (Math.pow(2.0,  i)) + min;
            System.out.println(min);
        }

        return min.longValue();
    }
}
