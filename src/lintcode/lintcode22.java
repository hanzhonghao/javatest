package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhonghao.han on 8/2/2018.
 * 描述
 * 给定一个列表，该列表中的每个要素要么是个列表，要么是整数。将其变成一个只包含整数的简单列表。
 * <p>
 * 如果给定的列表中的要素本身也是一个列表，那么它也可以包含列表。
 * <p>
 * 样例
 * 给定 [1,2,[1,2]]，返回 [1,2,1,2]。
 * <p>
 * 给定 [4,[3,[2,[1]]]]，返回 [4,3,2,1]。
 */
public class lintcode22 {

  // @param nestedList a list of NestedInteger
  // @return a list of integer
  public List<Integer> flatten(List<NestedInteger> nestedList) {
    // Write your code here
    List<Integer> result = new ArrayList<>();
    doFlatten(nestedList,result);
    return result;
  }


  private void doFlatten(List<NestedInteger> nestedList,List<Integer> result) {
    for (NestedInteger nestedInteger : nestedList) {
      if (nestedInteger.isInteger()) {
        result.add(nestedInteger.getInteger());
      } else {
        doFlatten(nestedInteger.getList(),result);
      }
    }
  }

  // This is the interface that allows for creating nested lists.
  // You should not implement it, or speculate about its implementation
  public interface NestedInteger {

    // @return true if this NestedInteger holds a single integer,
    // rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds,
    // if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds,
    // if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
  }
}

/***
 * 非递归解法
 */
/**
 *   // @param nestedList a list of NestedInteger
 // @return a list of integer
 public List<Integer> flatten(List<NestedInteger> nestedList) {
 boolean isFlat = true;
 List<NestedInteger> ls = nestedList;
 while (isFlat) {
 isFlat = false;
 List<NestedInteger> newLs = new ArrayList<>();
 for (NestedInteger ni : ls) {
 if (ni.isInteger()) {
 newLs.add(ni);
 } else {
 newLs.addAll(ni.getList());
 isFlat = true;
 }
 }
 ls = newLs;
 }
 List<Integer> r = new ArrayList<>();
 for (NestedInteger ni : ls) {
 r.add(ni.getInteger());
 }
 return r;
 }
 */
