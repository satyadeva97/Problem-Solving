import java.util.ArrayList;
import java.util.List;

public class SubSequences {
  static List<List<Character>> result = new ArrayList<>();
  public static void main(String[] args) {
    String s = "abc";
    for (int i = 0; i < s.length(); i++) {
      subSets(s, i, new ArrayList<Character>());
    }
    System.out.println(result.toString());
  }

  private static void subSets(String s, int i, ArrayList<Character> current) {
    current.add(s.charAt(i));
    result.add(new ArrayList(current));
    if (i == s.length() - 1) {
      return;
    }
    subSets(s, i + 1, current);
  }

}
