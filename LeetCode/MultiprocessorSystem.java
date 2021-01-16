import java.util.*;

public class MultiprocessorSystem {
  public static int multiprocessorSystem(int[] ability, int num, long processes) {
    PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

    for (int x : ability) {
      q.add(x);
    }

    int ans = 0;
    long count = 0;

    while (count < processes) {
      int x = q.poll();
      q.add(x / 2);
      ans += 1;
      count += x;
    }

    return ans;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = Integer.parseInt(scanner.nextLine());
    int[] ability = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    long processes = Long.parseLong(scanner.nextLine());
    scanner.close();
    System.out.println(multiprocessorSystem(ability, num, processes));
  }
}

