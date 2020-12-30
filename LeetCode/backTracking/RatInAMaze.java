public class RatInAMaze {

  public static void main(String[] args) {
    int[][] maze = {{1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}};
    int n = maze.length;
    System.out.println(n);
    solveMaze(maze);
  }

  private static void solveMaze(int[][] maze) {
    int[] xp = new int[] {
            0, 1
    };
    int[] yp = new int[] {
            1, 0
    };
    int x = 0;
    int y = 0;
    int [][] sol = new int[maze.length][maze.length];
    if (move(0, 0, maze, xp, yp, sol)) {
      System.out.println("Destination Reached");
      System.out.println(sol.toString());
      print(sol);
    } else {
      System.out.println("Not reachable");
    };
  }

  private static void print(int[][] sol) {
    for (int i = 0; i < sol.length; i++) {
      for (int j = 0; j < sol.length; j++) {
        System.out.print(sol[i][j] + " ");
      }
      System.out.println("\n");
    }
  }

  private static boolean move(int x, int y, int[][] maze, int[] xp, int[] yp, int[][] sol) {


    if (x == maze.length - 1 && y == maze.length - 1) {
      return true;
    }

    for (int i = 0; i < xp.length; i++) {
      int xn = x + xp[i];
      int yn = y + yp[i];
      if (safeMove(xn, yn, maze)) {
        sol[xn][yn] = 1;
        if (move(xn, yn, maze, xp, yp, sol)) {
          return true;
        } else {
          sol[xn][yn] = 0;
        }
      }
    }
    return false;
  }



  private static boolean safeMove(int x, int y, int[][] maze) {
    if (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] != 0) {
      return true;
    } else {
      return false;
    }

  }


}
