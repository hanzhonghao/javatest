package datastructures.leetcode;

import java.util.HashMap;

public class leetcode1 {


  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])){
        return new int[]{map.get(nums[i])+1,i+1};
      }
      map.put(target - nums[i],i);
    }
    return null;
  }

  public static void main(String[] args) {
    int[] numbers = { 2, 7, 11, 15 };
    int target = 17;
    int[] result = new leetcode1().twoSum(numbers, target);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }

}
