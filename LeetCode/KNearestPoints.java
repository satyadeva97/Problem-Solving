import java.util.PriorityQueue;

public class KNearestPoints {
  public int[][] kClosest(int[][] points, int K) {

    PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> distance(b) - distance(a));

    for (int i = 0; i < points.length; i++) {

      if (minHeap.size() == 0) {
        minHeap.add(points[i]);
      } else {

        minHeap.add(points[i]);

        if (minHeap.size() > K) {
          minHeap.poll();
        }
      }
    }
    int[][] result = new int[K][2];
    int i = 0;
    for(int[] x: minHeap) {
      result[i] = x;
      i++;
    }
    return result;
  }

  private int distance(int[] arr) {
    return (int) (Math.pow(arr[0], 2) + Math.pow(arr[1], 2));
  }
}
