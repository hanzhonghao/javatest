package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhonghao.han on 8/6/2018.
 * Given a non-overlapping interval list which is sorted by start point.
 * <p>
 * Insert a new interval into it, make sure the list is still in order and non-overlapping (merge intervals if necessary).
 * <p>
 * 样例
 * Insert (2, 5) into [(1,2), (5,9)], we get [(1,9)].
 * <p>
 * Insert (3, 4) into [(1,2), (5,9)], we get [(1,2), (3,4), (5,9)].
 */
public class lintcode30 {

  /**
   * @param intervals:   Sorted interval list.
   * @param newInterval: new interval.
   * @return: A new interval list.
   */
  public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    // write your code here

    if(intervals == null || newInterval == null)
      return null;


    List<Interval> result = new ArrayList<>();
    int insertPosition = 0;
    for (Interval interval : intervals) {
      if (newInterval.start > interval.end) {
        result.add(interval);
        insertPosition++;
      } else if (newInterval.end < interval.start) {
        result.add(interval);
      } else {
        newInterval.start = Math.min(interval.start, newInterval.start);
        newInterval.end = Math.max(interval.end, newInterval.end);
      }
    }
    result.add(insertPosition,newInterval);
    return result;
  }

  //Definition of Interval:
  static class Interval {
    int start, end;

    Interval(int start, int end) {
      this.start = start;
      this.end = end;
    }
  }
  public static void main(String args[]) {
    Interval interval1 = new Interval(2, 5);
    Interval interval2 = new Interval(3, 4);
    Interval interval3 = new Interval(1, 2);
    Interval interval4 = new Interval(5, 9);

    ArrayList<Interval> test1 = new ArrayList<>();

    test1.add(interval3);
    test1.add(interval4);

    List<Interval> insert1 = insert(test1, interval1);
    for (Interval i:insert1){
      System.out.println("("+i.start+","+i.end+")");
    }

    List<Interval> insert2 = insert(test1, interval2);
    for (Interval i:insert2){
      System.out.println("("+i.start+","+i.end+")");
    }

  }
}

