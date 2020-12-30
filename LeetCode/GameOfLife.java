
import java.util.Arrays;


public class GameOfLife {
  public static void main(String[] args) {
    int[][] arr = {
      {0,1,0},{0,0,1},{1,1,1},{0,0,0}
    };
    gameOfLife(arr);

  }

  private static void gameOfLife(int[][] board) {
    int[] xn = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};
    int[] yn = new int[]{-1, -1, -1, -0, 0, 1, 1, 1};
    int[][] result = new int[board.length][board[0].length];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        result[i][j] = isAlive(i, j, board, xn, yn);
      }
    }
    System.out.println(Arrays.deepToString(result));
    board = result;
    System.out.println(Arrays.deepToString(board));
  }

  private static int isAlive(int i, int j, int[][] board, int[] xn, int[] yn) {
    int count = 0;
    for (int k = 0; k < xn.length; k++) {
      int xtemp = i + xn[k];
      int ytemp = j + yn[k];
      if ((i + xn[k]) >= 0 && (i + xn[k]) < board.length && (j + yn[k]) >= 0 && (j + yn[k]) < board[0].length
              && board[i + xn[k]][j + yn[k]] == 1) {
        count++;
      }
    }

    if (board[i][j] == 1) {
      if (count < 2 || count > 3) {
        return 0;
      } else {
        return 1;
      }
    } else {
      if (count == 3) {
        return 1;
      } else {
        return 0;
      }
    }
  }
}
