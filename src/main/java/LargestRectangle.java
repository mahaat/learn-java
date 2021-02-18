import java.util.*;

public class LargestRectangle {
    static long largestRectangle(int[] h) {
        int rectangleHeight = 0;
        Queue<Integer> candidate = new LinkedList<>();
        int result = 0;

        for (int i = 0; i < h.length; i++) {
            int curHeight = h[i];
            if ( i == 0 ) {
                rectangleHeight = curHeight;
                candidate.add(curHeight);
                continue;
            }

            if ( curHeight == rectangleHeight) {
                candidate.add(curHeight);
            }

            if ( curHeight < rectangleHeight) {
                Integer top = candidate.peek();
                if (top < curHeight) {}
            }

            int rectangleWidth = candidate.size();
            int candidateResult = rectangleHeight * rectangleWidth;

           if ( result < candidateResult) {
               result = candidateResult;
           }
        }

        return result;
    }
}
