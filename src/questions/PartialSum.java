package questions;

public class PartialSum {
    private PartialSum() {}

    public static void solve(int dataNum, int total, int[] data) {

        if (dfs(0, 0, dataNum, total, data)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean dfs (int index, int sum, int dataNum, int total, int[] data) {
        if (index == dataNum) {
            return sum == total;
        }

        if (dfs(index + 1, sum, dataNum, total, data)) {
            return true;
        }

        if (dfs(index + 1, sum + data[index], dataNum, total, data)) {
            return true;
        }

        return false;
    }
}
