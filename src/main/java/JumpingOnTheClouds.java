public class JumpingOnTheClouds {
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int position = 0;

        while (position != c.length - 1) {
            if ((position + 2 != c.length) && (c[position + 2] == 0)) {
                position = position + 2;
                jumps++;
            } else {
                if (c[position + 1] == 0) {
                    position = position + 1;
                    jumps++;
                }
            }
        }

        return jumps;
    }
}
