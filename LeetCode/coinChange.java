class Node {
  int count;
  int num1;
  int num2;
  int num3;
  int num4;
  int num5;
  Node(int count, int num1, int num2, int num3, int num4, int num5) {
    this.count = count;
    this.num1 = num1;
    this.num2 = num2;
    this.num3 = num3;
    this.num4 = num4;
    this.num5 = num5;
  }
}

public class coinChange {
  public static void main(String[] args) {
    int[] coins = new int[]{100, 50, 20, 10, 5};
    int[] values = new int[]{3, 7, 0, 0, 0};
    System.out.println(coins(coins, values, 350));
  }

  private static int coins(int[] coins, int[] values, int i) {

    return 0;
  }
}
