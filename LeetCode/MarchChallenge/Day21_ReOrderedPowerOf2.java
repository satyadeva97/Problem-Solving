package MarchChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day21_ReOrderedPowerOf2 {
  public boolean reorderedPowerOf2(int N) {

    List<String> list = new ArrayList<>();
    for (int i = 0; i <= 30; i++) {
      list.add((int)Math.pow(2, i) + "");
    }

    String target = N + "";
    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < target.length(); i++) {
      if (map.containsKey(target.charAt(i))) {
        map.put(target.charAt(i), map.get(target.charAt(i)) + 1);
      } else {
        map.put(target.charAt(i), 1);
      }
    }

    Map<Character, Integer> map1 = new HashMap<>();
    outer:
    for(String s: list) {
      if (s.length() != target.length()) {
        continue;
      }
      map1.putAll(map);
      int i = 0;
      while (i < s.length()) {
        if (map1.containsKey(s.charAt(i)) && map1.get(s.charAt(i)) > 0) {
          map1.put(s.charAt(i), map1.get(s.charAt(i)) - 1);
          i++;
          if (i == s.length()) {
            return true;
          }

        } else {
          continue outer;
        }


      }
    }
    return false;

  }
}
