package datastructures.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：hao
 * @date ：Created in 3/19/2019
 */
public class leetcode830 {
  public List<List<Integer>> largeGroupPositions(String S) {
    char[] str = S.toCharArray();
    ArrayList<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < str.length - 2; i++) {
      int start = i;
      if (str[i] == str[i + 1] && str[i + 1] == str[i + 2]) {
        i += 2;
        while (i < str.length - 1) {
          if (str[i] != str[i + 1]) {
            break;
          }
          i++;
        }
        List<Integer> integers = Arrays.asList(new Integer[] { start, i });
        result.add(integers);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    String s ="abcdddeeeeaabbbcd";
    leetcode830 leetcode830 = new leetcode830();
    List<List<Integer>> lists = leetcode830.largeGroupPositions(s);
    System.out.println(lists.toString());
  }
}
