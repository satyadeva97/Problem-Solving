import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MicroprocessorScheduling {

  public static void main(String[] args) {
//    List<Integer> list = new ArrayList<Integer>();
//    list.add(2);
//    list.add(3);
//    list.add(1);
//    list.add(3);
//    list.add(2);
//    list.add(1);
//    list.add(4);
//    list.add(3);
//    list.add(2);
    System.out.println(lruCountMiss(6, List.of(2,3,1,3,2,1,4,3,2), 2));
  }

  private static int lruCountMiss(int num, List<Integer> pages, int maxCacheSize) {
    Deque<Integer> deq = new LinkedList();
    int count = 0;
    for (int i = 0; i < num; i++) {
      if (!deq.contains(pages.get(i))) {
        if (deq.size() < maxCacheSize) {
          deq.addLast(pages.get(i));
        } else {
          deq.pollFirst();
          deq.addLast(pages.get(i));
        }
        count++;
      } else {
        deq.remove(pages.get(i));
        deq.addLast(pages.get(i));
      }

    }
    return count;
  }
}
