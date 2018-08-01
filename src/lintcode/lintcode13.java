package lintcode;

/**
 * Created by zhonghao.han on 8/1/2018.
 * 描述
 对于一个给定的 source 字符串和一个 target 字符串，你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。如果不存在，则返回 -1。
 */
public class lintcode13 {
  /*
 * @param source: source string to be scanned.
 * @param target: target string containing the sequence of characters to match
 * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
 */
  public int strStr(String source, String target) {
    // write your code here
    if(source==null||target==null) {
      return -1;
    }
    int i = source.indexOf(target);
    return i;
  }

  public static void main(String[] args) {
    lintcode13 lintcode13 = new lintcode13();
    String A = "abcdefghij";
    String B = "de";
    System.out.println(lintcode13.strStr(A,B));
  }
}
