import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

  List<String> result = new ArrayList<>();

  public List<String> letterCombinations(String digits) {

    String[] phone = new String[]{"0","1","abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    String[] temp = new String[digits.length()];

    for (int i = 0; i < digits.length(); i++) {
      temp[i] = phone[Character.getNumericValue(digits.charAt(i))];
    }

    if (digits.length() != 0) {
      helper(temp, 0, "");
    }

    return result;

  }

  private void helper(String[] temp, int i, String current) {
    if (temp.length == i) {
      result.add(current);
    } else {
      String str = temp[i];
      for (int j = 0; j < str.length(); j++) {
        helper(temp, i + 1, current + str.charAt(j));
      }
    }
  }
}
