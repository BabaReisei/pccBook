package questions;

public class LakeCounting {
    private LakeCounting() {}

    public static void solve(int n, int m, char[][] field) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (field[i][j] == 'W') {
                    dfs(i, j, n, m, field);
                    res++;
                }
            }
        }
        System.out.println(res);
    }

    private static void dfs(int x, int y, int n, int m, char[][] field) {
        field[x][y] = '.';

        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <=1; dy++) {
                int nx = x + dx;
                int ny = y + dy;
                if (0 <= nx
                        && nx < n
                        && 0 <= ny
                        && ny < m
                        && field[nx][ny] == 'W') {
                    dfs(nx, ny, n, m, field);
                }
            }
        }
    }
}
