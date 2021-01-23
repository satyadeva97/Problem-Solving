import java.util.Stack;

public class ValidParanthesis {

  public boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();
    stack.add(s.charAt(0));

    for (int i = 1; i < s.length(); i++) {

      if (stack.isEmpty()) {
        stack.push(s.charAt(i));
      } else {
        if (opposite(s.charAt(i)) == stack.peek()) {
          stack.pop();
        } else {
          stack.push(s.charAt(i));
        }
      }

    }

    return stack.isEmpty() ? true : false;

  }

  private char opposite(char c) {

    switch(c) {
      case ']':
        return '[';
      case '}':
        return '{';
      case ')':
        return '(';
      default:
        return 'a';
    }
  }
}
