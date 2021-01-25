public class numberOfIslands {

  public int numIslands(char[][] grid) {

    int m = grid.length;
    int n = grid[0].length;
    int[][] visited = new int[m][n];

    // System.out.println(Arrays.deepToString(visited));

    int ans = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {

        if (grid[i][j] == '1' && visited[i][j] == 0) {
          dfs(visited, i, j, m, n, grid);
          ans++;

        }
      }
    }
    return ans;
  }

  private void dfs(int[][] visited, int m, int n, int rows, int col, char[][] grid) {

    if (m < 0 || n < 0 || m > rows -1 || n > col - 1 || grid[m][n] == '0' || visited[m][n] == 1) return;
    visited[m][n] = 1;
    dfs(visited, m, n + 1, rows, col, grid);
    dfs(visited, m - 1, n, rows, col, grid);
    dfs(visited, m + 1, n, rows, col, grid);
    dfs(visited, m , n - 1, rows, col, grid);

  }
}
