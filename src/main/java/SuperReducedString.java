public class SuperReducedString {
    static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder(s);

        boolean duplicate = false;

        do {
            duplicate = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                char s1 = sb.charAt(i);
                char s2 = sb.charAt(i+1);

                if (s1 == s2) {
                    sb.delete(i , i + 2);
                    duplicate = true;
                    break;
                }
            }
        } while (duplicate);

        if (sb.length() == 0) {
            return "Empty String";
        }
        return sb.toString();

    }
}
