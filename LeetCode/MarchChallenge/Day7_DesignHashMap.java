package MarchChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day7_DesignHashMap {

  //This solution works but not a proper way
  int[] arr;

  /**
   * Initialize your data structure here.
   */
  public Day7_DesignHashMap() {
    arr = new int[1000000];
    Arrays.fill(arr, -1);
  }

  /**
   * value will always be non-negative.
   */
  public void put(int key, int value) {
    arr[key] = value;
  }

  /**
   * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping
   * for the key
   */
  public int get(int key) {
    return arr[key];
  }

  /**
   * Removes the mapping of the specified value key if this map contains a mapping for the key
   */
  public void remove(int key) {
    arr[key] = -1;
  }

}
