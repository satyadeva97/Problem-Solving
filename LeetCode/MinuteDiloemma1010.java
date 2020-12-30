public class MinuteDiloemma1010 {
  public static void main(String[] args) {
    int [] time = new int[] {
            20,40,10,50,60
    };
    System.out.println(numPairsDivisibleBy60(time));
  }
  private static int numPairsDivisibleBy60(int[] time) {
    int[] countByTime = new int[60];
    int result = 0;
    for(int t: time) {
      t = t % 60;
      int remaining = t > 0 ? 60 - t : 0;
      int count = countByTime[remaining];
      result += count;
      countByTime[t] ++;
    }
    return result;
  }
}
