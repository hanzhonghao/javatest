package datastructures.leetcode;

/**
 * @author ：hao
 * @date ：Created in 3/21/2019
 */
public class leetcode168 {
  public String convertToTitle(int n) {
    int ten = n / 26;
    int one = n % 26;

    if(ten==0){
      return intToChar(one);
    }

    if (one == 0) {
      if(ten==1){
        return intToChar(n);
      }else {
        String first = intToChar(ten-1);
        String second = intToChar(n/ten);
        return first + second;
      }
    } else {
      String first = intToChar(ten);
      String second = intToChar(one);
      return first + second;
    }

  }

  public String intToChar(int n) {
    char a = 'A';
    char result = (char) (a + n -1);
    String results = String.valueOf(result);
    return results;
  }

  public static void main(String[] args) {
    int a = 52;
    String s = new leetcode168().convertToTitle(a);
    System.out.println(s);
  }
}
