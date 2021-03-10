package MarchChallenge;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Day10_IntToRoman {
  public static void main(String[] args) {
    System.out.println(intToRoman(897));
  }

  public static String intToRoman(int num) {
    int[] values = new int[] {1000, 500, 100, 50, 10, 5, 1};
    char[] characters = new char[] {'M', 'D', 'C', 'L', 'X', 'V','I'};
    Set<Integer> exceptions = new HashSet<>(List.of(4, 9, 40, 90, 400, 900));
    Set<Integer> exceptionNumbers = new HashSet<>(List.of(100, 10, 1));
    int n = (int) Math.floor(Math.log10((double) num));
    StringBuilder result = new StringBuilder();
    int nextNum = num;
    while (n >= 0) {
      int denom = (int) Math.pow(10, n--);
      int currentNum = (nextNum / denom) * (denom);
      nextNum = (nextNum % denom);
      int i = 0, j = -1;
      while (currentNum >= 1) {
        if ((!exceptions.contains(currentNum)) || currentNum >= 1000) {
          if (currentNum >= values[i]) {
            int count = currentNum / values[i];
            currentNum -= count * values[i];
            while (count-- > 0) {
              result.append(characters[i]);
            }
          } else {
            i++;
          }
        } else {
          if (currentNum >= values[i]) {
            j = i;
            while (j < values.length && !exceptionNumbers.contains(values[j])) {
              j++;
            }
            result.append(characters[j] + "" + characters[i - 1]);
            break;
          } else {
            i++;
          }
        }

      }

    }
    return result.toString();
  }
}
