public class CountingSwap {
    static void countSwaps(int[] a) {
        int swapCount = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if ( a[j] > a[j+1] ) {
                    swapCount ++;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("Array is sorted in "+  swapCount + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}
