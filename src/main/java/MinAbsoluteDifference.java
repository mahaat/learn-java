import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinAbsoluteDifference {
    static int minimumAbsoluteDifference(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if ( arr[j] > arr[j+1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        int minDiff = 2 * 10^9;
        for (int i = 1; i < arr.length; i++) {
            int localDif = Math.abs(arr[i-1] - arr[i]);
            if ( localDif < minDiff) {
                minDiff = localDif;
            }
        }

        return minDiff;
    }
}
