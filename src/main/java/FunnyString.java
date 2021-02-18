public class FunnyString {
    static String funnyString(String s) {
        boolean funny = true;
        char[] sChars = s.toCharArray();

        for (int i = 0; i < sChars.length; i++) {
            int curChar = sChars[i];
            int anotherChar = sChars[sChars.length - 1 - i];

            System.out.println(curChar);
            System.out.println(anotherChar);
            if(Math.abs(curChar - anotherChar) != 1) {
                funny = false;

            }
        }



        if (funny) {
            return  "Funny";
        } else {
            return  "Not Funny";
        }
    }
}
