package questions;

public class Ants {
    private Ants() {}
    public static void solve(int len, int dataNum, int[] ants) {
        int minTime = 0;
        int maxTime = 0;
        for (int ant: ants) {
            minTime = Math.max(minTime, Math.min(ant, len - ant));
            maxTime = Math.max(maxTime, Math.max(ant, len - ant));
        }

        System.out.println("min = " + minTime);
        System.out.println("max = " + maxTime);
    }
}
