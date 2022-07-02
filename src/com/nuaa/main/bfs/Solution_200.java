package com.nuaa.main.bfs;

public class Solution_200 {
    int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    boolean[][] flag;

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                flag = new boolean[m][n];
                if (grid[i][j] == '1') {
                    dfs(grid, flag, m, n, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public void dfs(char[][] grid, boolean[][] flag, int m, int n, int x, int y) {
        if (x < 0 || x >= m || y < 0 || y >= n || flag[x][y] || grid[x][y] == '0') return;
        flag[x][y] = true;
        grid[x][y] = '0';

        for (int i = 0; i < directions.length; i++) {
            int x1 = x + directions[i][0];
            int y1 = y + directions[i][1];
            dfs(grid, flag, m, n, x1, y1);
        }
    }


}
