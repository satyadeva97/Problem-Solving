public class RotatedSortedArray {
  public static void main(String[] args) {
    int[] nums = new int[]{1, 3};
    int target = 0;
    System.out.println(search(nums, target));
  }

  private static int search(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return -1;
    }
    int j = nums.length - 1;

    int l = 0, r = nums.length - 1;


    while (l < r) {
      int mid = l + (r - l) / 2;
      if (nums[mid] >= nums[nums.length - 1]) {
        l = mid + 1;
      } else {
        r = mid;
      }
    }

    j = l - 1;


    if (target > nums[nums.length - 1]) {
      return binarySearch(0, j, nums, target);
    } else {
      return binarySearch(j + 1, nums.length - 1, nums, target);
    }
  }

  private static int binarySearch(int low, int high, int[] nums, int target) {
    System.out.println("Hi");
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (target == nums[mid]) {
        return mid;

      } else if (target > nums[mid]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }
}
