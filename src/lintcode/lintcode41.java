package lintcode;

/**
 * Created by zhonghao.han on 8/7/2018.
 * 描述
 给定一个整数数组，找到一个具有最大和的子数组，返回其最大和。

 子数组最少包含一个数

 您在真实的面试中是否遇到过这个题？
 样例
 给出数组[−2,2,−3,4,−1,2,1,−5,3]，符合要求的子数组为[4,−1,2,1]，其最大和为6
 */
public class lintcode41 {
  /**
   * @param nums: A list of integers
   * @return: A integer indicate the sum of max subarray
   */
  public int maxSubArray(int[] nums) {
    // write your code here
    int size = nums.length;
    int max = nums[0];
    int nowM = 0;
    for (int i = 0; i < size; i++) {
      nowM += nums[i];
      if (nowM > max) {
        max = nowM;
      }
      if (nowM < 0) {
        nowM = 0;
      }
    }
    return max;
  }
}
