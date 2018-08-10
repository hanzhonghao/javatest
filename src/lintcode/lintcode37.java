package lintcode;

/**
 * Created by zhonghao.han on 8/10/2018.
 * 描述
 反转一个只有3位数的整数。

 你可以假设输入一定是一个只有三位数的整数，这个整数大于等于100，小于1000。

 您在真实的面试中是否遇到过这个题？
 样例
 123 反转之后是 321。
 900 反转之后是 9。
 */
public class lintcode37 {
  /**
   * @param number: A 3-digit number.
   * @return: Reversed number.
   */
  public int reverseInteger(int number) {
    // write your code here

    return number % 10 * 100 + number / 10 % 10 * 10 + number / 100;
  }
}
