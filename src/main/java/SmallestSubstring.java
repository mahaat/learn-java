import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SmallestSubstring {
    public static String smallestString(List<String> substrings) {
        Stream<String> stream = substrings.stream()
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        if (o1.length() == o2.length()) {
                            return o1.compareTo(o2);
                        }

                        if ( o1.length() < o2.length()) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                });

        StringBuilder sb = new StringBuilder();
        stream.forEach( s-> sb.append(s));
        return sb.toString();
    }
}
//
//    Stream<String> stream = substrings.stream()
//            .sorted(Comparator.naturalOrder());
