package backTracking;

import java.util.Arrays;

public class Queen3 {
  public static void main(String[] args) {

    int [][] result = new int[4][4];
    if (placeQueen(result, 0)) {
      System.out.println("True");
      System.out.println(Arrays.deepToString(result));
    } else {
      System.out.print("not possible");
    };
  }

  private static boolean placeQueen(int[][] result, int col) {
    if (col == 4) {
      return true;
    }

    for (int  i = 0; i < 4; i++) {
      if (isSafe(i, col, result)) {
        result[i][col] = 1;
        if (placeQueen(result, col + 1)) {
          return true;
        } else {
          result[i][col] = 0;
        }
      }
    }
    return false;
  }


  private static boolean isSafe(int x, int y, int[][] result) {

    for (int i = 0; i < y; i++) {
      if (result[x][i] == 1) {
        return false;
      }
    }

    while (x >= 1 && y >= 1) {
      x--;
      y--;
      if (result[x][y] == 1) {
        return false;
      }
    }

    while (x >= 1&& y <= result.length - 2) {
      x--;
      y++;
      if (result[x][y] == 1) {
        return false;
      }
    }
    return true;
  }
}
