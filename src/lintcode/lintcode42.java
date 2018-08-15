package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhonghao.han on 8/15/2018.
 * 给定一个整数数组，找到一个具有最小和的子数组。返回其最小和。

 子数组最少包含一个数字

 您在真实的面试中是否遇到过这个题？
 样例
 给出数组[1, -1, -2, 1]，返回 -3
 */
public class lintcode42 {
  /*
    * @param nums: a list of integers
    * @return: A integer indicate the sum of minimum subarray
    */
  public int minSubArray(List<Integer> nums) {
    // write your code here
    int len = nums.size();
    int min = nums.get(0);
    int sum = 0;
    for (int i = 0;i<len;i++){
      sum += nums.get(i);
      if (sum<min){
        min = sum;
      }
      if (sum>0){
        sum=0;
      }
    }
    return min;
  }


  public static void main(String args[]) {
    ArrayList<Integer> objects = new ArrayList<>();
    objects.add(1);
    objects.add(-1);
    objects.add(-2);
    objects.add(1);

    lintcode42 ll = new lintcode42();
    int i = ll.minSubArray(objects);

    System.out.println(i);
    }
}
