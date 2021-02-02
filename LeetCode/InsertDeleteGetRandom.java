import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandom {
  Map<Integer, Integer> valIndex;
  Map<Integer, Integer> indexVal;
  int count;
  Random rand;
  /** Initialize your data structure here. */
  public InsertDeleteGetRandom() {
    valIndex = new HashMap<>();
    indexVal = new HashMap<>();
    count = 0;
    rand = new Random();
  }

  /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
  public boolean insert(int val) {
    if (valIndex.containsKey(val)) {
      return false;
    } else {
      valIndex.put(val, count);
      indexVal.put(count, val);
      count++;
      return true;
    }
  }

  /** Removes a value from the set. Returns true if the set contained the specified element. */
  public boolean remove(int val) {
    if (valIndex.containsKey(val)) {
      indexVal.remove(valIndex.get(val));
      valIndex.remove(val);
      return true;
    } else {
      return false;
    }
  }

  /** Get a random element from the set. */
  public int getRandom() {
    while (true) {
      int temp = rand.nextInt(count);
      if (indexVal.containsKey(temp)) {
        return indexVal.get(temp);
      }
    }


  }
}
