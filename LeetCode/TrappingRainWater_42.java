public class TrappingRainWater_42 {
  public int trap(int[] height) {

    int[] left = new int[height.length];
    int[] right = new int[height.length];
    int result = 0;
    int maxSoFar = Integer.MIN_VALUE;
    for (int i = 0; i < height.length; i++) {

      maxSoFar = Math.max(maxSoFar, height[i]);
      left[i] = maxSoFar - height[i];
    }

    maxSoFar = Integer.MIN_VALUE;
    for (int i = height.length - 1; i > 0; i--) {

      maxSoFar = Math.max(maxSoFar, height[i]);
      right[i] = maxSoFar - height[i];
    }

    for (int i = 0; i < height.length; i++) {
      result += Math.min(left[i], right[i]);
    }
    return result;
  }
}
