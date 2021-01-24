import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class finalPrices {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(1);
    list.add(3);
    list.add(4);
    list.add(6);
    list.add(2);
    finalPrice(list);
  }

//  public static void finalPrice(List<Integer> prices) {
//    if (prices.size() == 0) return;
//    // Next Less Element
//    Deque<Integer> NLE = new ArrayDeque<>();
//    int res = 0;
//    List<Integer> temp = new ArrayList<Integer>();
//    for (int i = prices.size() - 1; i >= 0; i--) {
//      while (NLE.size() != 0 && NLE.peekFirst() > prices.get(i)) {
//
//        NLE.pollFirst();
//      }
//
//      if (NLE.isEmpty()) {
//        res += prices.get(i);
//        temp.add(prices.get(i));
//      } else {
//        res += prices.get(i) - NLE.peek();
//      }
//
//
//      NLE.offerFirst(prices.get(i));
//    }
//    Collections.reverse(temp);
//    System.out.println(res);
//    for (int i = 0; i < temp.size(); i++) {
//      System.out.print(temp.get(i) + " ");
//    }
//
//  }

  public static void finalPrice(List<Integer> prices) {
    if (prices.size() == 0) return;
    Deque<Integer> NLE = new ArrayDeque<>();
    int res = 0;
    int minIndex = 0;
    List<Integer> temp = new ArrayList<>();
    for (int i = prices.size() - 1; i >= 0; i--) {
      while (NLE.size() != 0 && NLE.peekFirst() > prices.get(i)) {
        NLE.pollFirst();
      }
      int x = NLE.isEmpty() ? prices.get(i) : prices.get(i) - NLE.peek();
      if (prices.get(i) - x == 0) {
        temp.add(i);
      }
      res += x;
      NLE.offerFirst(prices.get(i));
    }
    System.out.println(res);
    System.out.println(NLE.toString());
    Collections.reverse(temp);
    for (int i = 0; i < temp.size(); i++) {
      System.out.print(temp.get(i) + " ");
    }
  }
}
