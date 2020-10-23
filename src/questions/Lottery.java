package questions;

import java.util.Arrays;

public class Lottery {
    private Lottery() {}

    public static void solve(int dataNum, int sum, int[] nums) {
        int[] numsSq = new int[dataNum * dataNum];
        int cnt = 0;
        for (int numFwd : nums) {
            for (int numBwd : nums) {
                numsSq[cnt] = numFwd + numBwd;
                cnt ++;
            }
        }
        Arrays.sort(numsSq);
        for (int num : numsSq) {
            if (Arrays.binarySearch(numsSq, sum - num) > 0) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
