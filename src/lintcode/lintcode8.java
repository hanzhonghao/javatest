package lintcode;

/**
 * Created by zhonghao.han on 8/1/2018.
 * 样例
 * 对于字符串 "abcdefg".
 * <p>
 * offset=0 => "abcdefg"
 * offset=1 => "gabcdef"
 * offset=2 => "fgabcde"
 * offset=3 => "efgabcd"
 */
public class lintcode8 {
  /**
   * @param str:    An array of char
   * @param offset: An integer
   * @return: nothing
   */
  public static char[] rotateString(char[] str, int offset) {
    // write your code here
    if (null == str || str.length == 0) {
      return str;
    }
    offset = offset % str.length; //保证偏移量在字符串长度范围内
    while (offset > 0) {
      shitOneChar(str);
      offset--;
    }
    return str;
  }

  public static void shitOneChar(char[] str) {
    int len = str.length;
    char last = str[len - 1];

    for (int i = len-1; i >0 ; i--) {
      str[i] = str[i-1];
    }
    str[0] = last;
  }

  public static void main(String args[]) {
    char str[] = { 'u', 'b', 'u', 'n', 't', 'u' };
    rotateString(str, 6);
    System.out.println(str);
  }
}
