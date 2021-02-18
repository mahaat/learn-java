public class CamelCaseCounter {
    static int camelcase(String s) {
        int count = 1;
        char[] charArr = s.toCharArray();

        for (char s1 : charArr) {
            if(Character.isUpperCase(s1)) {
                count++;
            }
        }

        return count;
    }
}
