import java.util.Arrays;

public class rookieCaptures_leetcode999 {
  public int numRookCaptures(char[][] board) {

    int[] rook = new int[2];
    int count = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == 'R') {
          rook[0] = i;
          rook[1] = j;
          break;
        }
      }
    }
    System.out.println(Arrays.toString(rook));
    int row = rook[0];
    int column = rook[1];
    int i = column;
    while (column >= 0) {
      if (board[row][column] == 'B') break;
      if (board[row][column--] == 'p')  {
        count++;
        break;
      }
    }
    column = rook[1];
    row = rook[0];
    while (column < board.length) {
      if (board[row][column] == 'B') break;
      if (board[row][column++] == 'p')  {
        count++;
        break;
      }
    }
    column = rook[1];
    row = rook[0];
    while (row >= 0) {
      if (board[row][column] == 'B') break;
      if (board[row--][column] == 'p')  {
        count++;
        break;
      }
    }
    column = rook[1];
    row = rook[0];
    while (row < board.length) {
      if (board[row][column] == 'B') break;
      if (board[row++][column] == 'p')  {
        count++;
        break;
      }
    }

    return count;

  }
}
