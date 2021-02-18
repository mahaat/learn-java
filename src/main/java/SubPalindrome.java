import java.util.HashSet;
import java.util.Set;

public class SubPalindrome {
    public static int palindrome(String s) {
        // Write your code here
        Set<String> palindromeSet = new HashSet<>();

        for (int i = 1; i < s.length(); i++) {
            int j = 0;
            while (j < s.length()) {
                String candidate = s.substring(i, j + i);
                StringBuilder sb = new StringBuilder(candidate);
                if (candidate.equals(sb.reverse().toString())) {
                    palindromeSet.add(candidate);
                }
                j += i;
                System.out.println(j);
            }
        }



        return palindromeSet.size();
    }
}
