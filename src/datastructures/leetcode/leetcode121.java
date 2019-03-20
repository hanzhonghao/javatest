package datastructures.leetcode;

/**
 * @author ：hao
 * @date ：Created in 3/20/2019
 */
public class leetcode121 {
  public int maxProfit(int[] prices) {
    int result = 0;
    for (int i = 0; i < prices.length; ++i) {
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[j] - prices[i] < 0) {
          break;
        } else {
          int value = prices[j] - prices[i];
          if (value > result) {
            result = value;
          }
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] a = new int[] { 7, 6, 5, 3, 2, 1 };
    int i = new leetcode121().maxProfit(a);
    System.out.println(i);
  }
}
