package questions;

import java.util.Arrays;

public class Triangle {
    private Triangle() {}

    public static void solve(int dataNum, int[] len) {
        Arrays.sort(len);
        int maxLength = 0;
        for (int  i = 0; i < dataNum - 2; i++) {
            for (int j = i + 1; j < dataNum -1; j++) {
                for (int k = j + 1; k < dataNum; k++) {
                    if (len[i] + len[j] > len[k]) {
                        maxLength = Math.max(maxLength, len[i] + len[j] + len[k]);
                    }
                }
            }
        }
        System.out.println(maxLength);
    }
}
