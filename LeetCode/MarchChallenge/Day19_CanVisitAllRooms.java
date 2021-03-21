package MarchChallenge;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Day19_CanVisitAllRooms {
  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    Queue<Integer> que = new LinkedList<Integer>();
    List<Integer> temp = rooms.get(0);
    for (int x: temp) {
      que.add(x);
    }
    boolean[] visited = new boolean[rooms.size()];
    visited[0] = true;
    List<Integer> temp1;
    while (que.size() > 0) {
      int n = que.size();
      for (int i = 0; i < n; i++) {
        int index = que.poll();
        visited[index] = true;
        temp1 = rooms.get(index);
        for (int x: temp1) {
          if (!visited[x]) {
            que.add(x);
          }
        }
      }
    }

    for (int i = 0; i < visited.length; i++) {
      if (!visited[i]) return false;
    }
    return true;
  }
}
