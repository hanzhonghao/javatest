package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhonghao.han on 8/1/2018.
 */
public class lintcode9 {
  /**
   * @param n: An integer
   * @return: A list of strings.
   *
   * 描述
  给你一个整数n. 从 1 到 n 按照下面的规则打印每个数：

  如果这个数被3整除，打印fizz.
  如果这个数被5整除，打印buzz.
  如果这个数能同时被3和5整除，打印fizz buzz.
  您在真实的面试中是否遇到过这个题？
  样例
  比如 n = 15, 返回一个字符串数组：

  [
  "1", "2", "fizz",
  "4", "buzz", "fizz",
  "7", "8", "fizz",
  "buzz", "11", "fizz",
  "13", "14", "fizz buzz"
  ]
   *
   */
  public List<String> fizzBuzz(int n) {
    // write your code here
    ArrayList<String> results = new ArrayList<String>();
    for (int i = 1; i <= n; i++) {
      if (i % 15 == 0) {
        results.add("fizz buzz");
      } else if (i % 5 == 0) {
        results.add("buzz");
      } else if (i % 3 == 0) {
        results.add("fizz");
      } else {
        results.add(String.valueOf(i));
      }
    }
    return results;


  }

  public static void main(String args[]) {
    int n = 15;
    lintcode9 lintcode9 = new lintcode9();
    List<String> strings = lintcode9.fizzBuzz(n);
    for (String a :strings){
      System.out.println(a);
    }
  }
}
