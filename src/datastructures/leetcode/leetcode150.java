package datastructures.leetcode;

import java.util.Stack;

public class leetcode150 {
  public static int evalRPN(String[] tokens) {
    if(tokens == null || tokens.length==0){
      return 0;
    }
    Stack<Integer> integers = new Stack<>();
    for (String token : tokens) {

      if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
        int a = integers.pop();
        int b = integers.pop();
        integers.push(calculate(b, a, token));
      }else{
        integers.push(Integer.parseInt(token));
      }
    }
    return integers.pop();
  }

  private static Integer calculate(int a, int b, String token) {
    if (token.equals("+")) {
      return a + b;
    } else if (token.equals("-")) {
      return a - b;
    } else if (token.equals("*")) {
      return a * b;
    } else {
      if (b == 0) {
        throw new RuntimeException(b+ " is not supported");
      } else {
        return a / b;
      }
    }
  }

  public static void main(String[] args) {
    String[] input = new String[] {"4","13","0","/","+"};
    System.out.println(evalRPN(input));
  }

}
