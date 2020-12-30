public class ContainerWithMostWater_11 {
  public int maxArea(int[] height) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < height.length - 1; i++) {
      for(int j = i + 1; j < height.length; j++) {
        max = Math.max(max, (((j + 1) - (i + 1)) * Math.min(height[i], height[j])));
      }
    }
    return max;

  }
}
