import java.util.PriorityQueue;
import java.util.Queue;

public class lastStoneWeight1046 {
  public static void main(String[] args) {
    int[] stones = new int[] {
            1, 4, 5, 7, 9 ,10
    };
    System.out.println(lastStoneWeight(stones));
  }

  public static int lastStoneWeight(int[] stones) {
    Queue<Integer> que =  new PriorityQueue<Integer>((a, b) -> {
      return b - a;
    });
    for (int i = 0; i < stones.length; i++ ) {
      que.add(stones[i]);
    }
    while(que.size() > 1) {
      int temp1 = que.remove();
      int temp2 = que.remove();
      if (temp1 == temp2 ) {
        continue;
      } else {
        que.add(temp1 - temp2);
      }
    }
    if (que.size() > 0) {
      return que.remove();
    } else {
      return 0;
    }

  }
}
