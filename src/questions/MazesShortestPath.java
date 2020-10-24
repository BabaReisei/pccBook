package questions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class MazesShortestPath {
    private MazesShortestPath() {}
    private static final int INF = 100000000;
    private static final int[] DX = {1, 0, -1, 0};
    private static final int[] DY = {0, 1, 0, -1};

    public static void solve(int n, int m, int sx, int sy, int gx, int gy, char[][] maze) {
        int[][] d = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                d[i][j] = INF;
            }
        }
        Queue<List<Integer>> que = new ArrayDeque<List<Integer>>();
        que.add(Arrays.asList(new Integer[] {sx, sy}));
        d[sx][sy] = 0;

        while (!que.isEmpty()) {
            List<Integer> l = que.poll();

            if (l.get(0) == gx && l.get(1) == gy) {
                break;
            }

            int nx = 0;
            int ny = 0;
            for (int i = 0; i < 4; i++) {
                nx = l.get(0) + DX[i];
                ny = l.get(1) + DY[i];

                if (0 <= nx
                        && nx < n
                        && 0 <= ny
                        && ny < m
                        && maze[nx][ny] != '#'
                        && d[nx][ny] == INF) {
                    que.add(Arrays.asList(new Integer[]{nx, ny}));
                    d[nx][ny] = d[l.get(0)][l.get(1)] + 1;
                }
            }
        }
        System.out.println(d[gx][gy]);
    }
}
