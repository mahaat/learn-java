public class MinSwaps {
    static int minimumSwaps(int[] arr) {
    int n = arr.length;
    int result = 0;

        for (int i = 0; i < n - 1 ; i++) {

            if (arr[i] == i +1 ){
                continue;
            }

            int targetValue = i + 1;
            for (int j = i + 1; j < n ; j++) {
                if (arr[j] == targetValue) {
                    result++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    continue;
                }
            }

        }


    return result;
    }
}
