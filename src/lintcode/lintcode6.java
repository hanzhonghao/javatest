package lintcode;

/**
 * Created by zhonghao.han on 7/31/2018.
 * 描述
 * 合并两个排序的整数数组A和B变成一个新的数组。
 * 给出A=[1,2,3,4]，B=[2,4,5,6]，返回 [1,2,2,3,4,4,5,6]
 * <p>
 * 挑战
 * 你能否优化你的算法，如果其中一个数组很大而另一个数组很小？
 */
public class lintcode6 {
  /**
   * @param A: sorted integer array A
   * @param B: sorted integer array B
   * @return: A new sorted integer array
   */
  public int[] mergeSortedArray(int[] A, int[] B) {
    // write your code here
    int[] result = new int[A.length + B.length];
    if (A.length == 0) {
      return B;
    }
    if (B.length == 0) {
      return A;
    }
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < A.length && j < B.length) {
      if (A[i] > B[j]) {
        result[k++] = B[j++];
      } else {
        result[k++] = A[i++];
      }
    }
    while (i < A.length) {
      result[k++] = A[i++];
    }
    while (j < B.length) {
      result[k++] = B[j++];
    }
    return result;
  }

}

