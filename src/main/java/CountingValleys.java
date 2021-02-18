public class CountingValleys {
    public static int countingValleys(int steps, String path) {
       int position = 0 ;
       int valleyCount = 0;
        for (int i = 0; i < steps; i++) {
            char step = path.charAt(i);
            if (step == 'U') {
                if (position == -1 ) {
                    valleyCount ++;
                }
                position ++;
            }

            if (step == 'D') {
                position --;
            }


        }

        return valleyCount;

    }
}
