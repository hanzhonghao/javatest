package datastructures.leetcode;

/**
 * @author ：hao
 * @date ：Created in 3/21/2019
 */
public class leetcode168best {
  public String convertToTitle(int n){
    String s="";
    while(n!=0){
      int temp =(n-1)%26;
      s=(char)('A'+temp)+s;
      n=(n-1)/26;
    }
    return s;
  }
}
