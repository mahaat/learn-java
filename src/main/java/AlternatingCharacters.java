public class AlternatingCharacters {
    static int alternatingCharacters(String s) {
        int adjacentCharCount = 0;
        char[] byteArr = s.toCharArray();
        for (int i = 1; i < byteArr.length; i++) {
            if ( byteArr[i] == byteArr[i-1]) {
                adjacentCharCount ++;
            }
        }
        return adjacentCharCount;
    }
}
