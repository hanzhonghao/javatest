package lintcode;

public class leetcode709 {

  public static String toLowerCase(String str) {
    char[] res = str.toCharArray();
    for(int i = 0; i < res.length; i++)
      if(res[i] >= 'A' && res[i] <= 'Z') res[i] += 32;
    return new String(res);
  }
  public static void main(String[] args) {
    String a= "Hello";
    String s = toLowerCase(a);
    System.out.println(s);
  }
}
