package lintcode;

import java.util.List;

/**
 * Created by zhonghao.han on 8/1/2018.
 * 描述
 * 给定一个排序的整数数组（升序）和一个要查找的整数target，用O(logn)的时间查找到target第一次出现的下标（从0开始），如果target不存在于数组中，返回-1。
 */
public class lintcode14 {
  /**
   * @param nums:   The integer array.
   * @param target: Target to find.
   * @return: The first position of target. Position starts from 0.
   */
  public int binarySearch(int[] nums, int target) {
    int resultIndex = -1;

    int lowIndex = 0;
    int highIndex = nums.length - 1;

    while (true) {
      resultIndex = (lowIndex + highIndex) / 2;
      if (lowIndex > highIndex) {
        return -1;
      } else if (nums[resultIndex] == target) {
        //这个循环是用来保证有重复的数据时，返回第一个匹配数据的索引
        while((resultIndex>=1)&&(nums[resultIndex]==nums[resultIndex-1])){
          resultIndex--;
        }
        return resultIndex;
      } else {
        if (target < nums[resultIndex])
          highIndex = resultIndex - 1;
        else {
          lowIndex = resultIndex + 1;
        }
      }
    }

  }

  public static void main(String args[]) {
    int[] n = {3,4,5,8,8,9,7,10,13,14};
    int target = 8;
    lintcode14 lintcode14 = new lintcode14();
    int i = lintcode14.binarySearch(n, target);
    System.out.println(i);
  }
}
