package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhonghao.han on 8/7/2018.
 * 描述
 给定一个旋转排序数组，在原地恢复其排序。

 说明
 什么是旋转数组？

 比如，原始数组为[1,2,3,4], 则其旋转数组可以是[1,2,3,4], [2,3,4,1], [3,4,1,2], [4,1,2,3]
 样例
 [4, 5, 1, 2, 3] -> [1, 2, 3, 4, 5]
 */
public class lintcode39 {
  /**
   * 解题思路：先找到数组中最小的值，然后把该值的索引前的数组反转，然后把索引+1，也就是从最小值开始往后的值反转，最后把整个数组反转
   */

  /**
   * @param nums: An integer array
   * @return: nothing
   */
  public void recoverRotatedSortedArray(List<Integer> nums) {
    // write your code here
    int numslen = nums.size();
    for (int i=0;i<numslen-1;i++){
      if (nums.get(i)>nums.get(i+1)){
        reverse(nums,0,i);
        reverse(nums,i+1,numslen-1);
        reverse(nums,0,numslen-1);

      }
    }
  }

  public void reverse(List<Integer> nums,int start,int end){
    while(start<end){
      Integer tem = nums.get(start);
      nums.set(start,nums.get(end));
      nums.set(end,tem);
      start++;
      end--;
    }
  }


  public static void main(String args[]) {
    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(4);
    integers.add(5);
    integers.add(1);
    integers.add(2);
    integers.add(3);
    lintcode39 ll =new lintcode39();
    for (Integer result : integers){
      System.out.print(result);
    }
    System.out.println("          ");
    ll.recoverRotatedSortedArray(integers);
    for (Integer result : integers){
      System.out.print(result);
    }
  }
}
